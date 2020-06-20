package com.company;

public class Convert{

    public static final double MM_IN_INCH = 25.4;
    public static final double MM_IN_FOOT = 304.8;
    public static final double MM_IN_YARD = 914.4;
    public static final double MM_IN_MILE = 1609344;

    //Methods to Convert Centimeters to Inches

    public static double cm2inches(double cm){
        double powerOfTen = Math.pow(10,2);
        return Math.round(cm * 0.393 * powerOfTen )/powerOfTen;
    }
    public static double cm2inches(double cm, int rounding){
        double powerOfTen = Math.pow(10,rounding);
        return Math.round(cm * 0.393 * powerOfTen )/powerOfTen;
    }
    public static String cm2inches(double cm, int rounding, boolean addUnits){
        double powerOfTen = Math.pow(10,rounding);
        double answer = Math.round(cm * 0.393 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " inches");
        }else{
            return String.valueOf(answer);
        }
    }
    public static String cm2inches(double cm, boolean addUnits){
        double powerOfTen = Math.pow(10,2);
        double answer = Math.round(cm * 0.393 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " inches");
        }else{
            return String.valueOf(answer);
        }
    }

    //Methods to Convert meters to feet

    public static double m2feet(double m){
        double powerOfTen = Math.pow(10,2);
        return Math.round(m * 3.281 * powerOfTen )/powerOfTen;
    }
    public static double m2feet(double m, int rounding){
        double powerOfTen = Math.pow(10,rounding);
        return Math.round(m * 3.281 * powerOfTen )/powerOfTen;
    }
    public static String m2feet(double m, int rounding,boolean addUnits){
        double powerOfTen = Math.pow(10,rounding);
        double answer = Math.round(m * 3.281 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " feet");
        }else{
            return String.valueOf(answer);
        }
    }
    public static String m2feet(double m,boolean addUnits){
        double powerOfTen = Math.pow(10,2);
        double answer = Math.round(m * 3.281 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " feet");
        }else{
            return String.valueOf(answer);
        }
    }

    //Methods to Convert Meters to Yards

    public static double m2yards(double m){
        double powerOfTen = Math.pow(10,2);
        return Math.round(m * 1.094 * powerOfTen )/powerOfTen;
    }
    public static double m2yards(double m,int rounding){
        double powerOfTen = Math.pow(10,rounding);
        return Math.round(m * 1.094 * powerOfTen )/powerOfTen;
    }
    public static String m2yards(double m,int rounding,boolean addUnits){
        double powerOfTen = Math.pow(10,rounding);
        double answer = Math.round(m * 1.094 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " yards");
        }else{
            return String.valueOf(answer);
        }
    }
    public static String m2yards(double m,boolean addUnits){
        double powerOfTen = Math.pow(10,2);
        double answer = Math.round(m * 1.094 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " yards");
        }else{
            return String.valueOf(answer);
        }
    }

    //Methods to Convert Kilometers to Miles

    public static double km2miles(double km){
        double powerOfTen = Math.pow(10,2);
        return Math.round(km * 0.621 * powerOfTen )/powerOfTen;
    }
    public static double km2miles(double km,int rounding){
        double powerOfTen = Math.pow(10,rounding);
        return Math.round(km * 0.621 * powerOfTen )/powerOfTen;
    }
    public static String km2miles(double km,int rounding,boolean addUnits){
        double powerOfTen = Math.pow(10,rounding);
        double answer = Math.round(km * 0.621 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " miles");
        }else{
            return String.valueOf(answer);
        }
    }
    public static String km2miles(double km,boolean addUnits){
        double powerOfTen = Math.pow(10,2);
        double answer = Math.round(km * 0.621 * powerOfTen )/powerOfTen;
        if(addUnits){
            return (answer + " miles");
        }else{
            return String.valueOf(answer);
        }
    }
}
