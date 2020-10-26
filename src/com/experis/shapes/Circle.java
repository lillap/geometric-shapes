package com.experis.shapes;

import java.text.DecimalFormat;

public class Circle extends Shape{

    public static double calculateArea(int radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
