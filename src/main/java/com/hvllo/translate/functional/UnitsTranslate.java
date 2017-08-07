package com.hvllo.translate.functional;

public class UnitsTranslate {
    private double ft;
    private double mtr;

    public UnitsTranslate() {
        this.ft = 0.0;
        this.mtr = 0.0;
    }
    public double footsToMeters(double ft) {
        if(ft <= 0.0)
            return -1;
        return mtr = (ft/0.3048);
    }
    public double metersToFoots(double mtr) {
        if(mtr <= 0.0)
            return -1;
        return ft = (mtr*0.3048);
    }
}
