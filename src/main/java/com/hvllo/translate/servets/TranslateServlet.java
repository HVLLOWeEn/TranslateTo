package com.hvllo.translate.servets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import com.hvllo.translate.functional.UnitsTranslate;

@WebServlet("/translateServlet")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UnitsTranslate unitsTranslate = new UnitsTranslate();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();

        String select = req.getParameter("SelectInYouUnits");

        if(select.equals("Foots")) {
            String ft = req.getParameter("inputValue");
            double valueFoots = Double.parseDouble(ft);
            double resultInMeter = unitsTranslate.footsToMeters(valueFoots);

            printWriter.println("<h2>You results from Ft in Meter:</h2><br>");
            printWriter.println(valueFoots + " ft = "+ resultInMeter + " meters"+"<br>");
            printWriter.println("<a href='http://localhost:8080/index.html'>Go back</a>");
        }
        else if(select.equals("Meters")) {
            String mtr = req.getParameter("inputValue");
            double valueMeter = Double.parseDouble(mtr);
            double resultInFoot = unitsTranslate.metersToFoots(valueMeter);

            printWriter.println("<h2>You results from Meter in Foots:</h2><br>");
            printWriter.println(valueMeter + " meters = " + resultInFoot + " foots" + "<br>");
            printWriter.println("<a href='http://localhost:8080/index.html'>Go back</a>");
        }
    }
}
