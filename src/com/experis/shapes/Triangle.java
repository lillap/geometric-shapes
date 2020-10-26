package com.experis.shapes;

public class Triangle extends Shape{

    public static double calculateArea(int dimension1, int dimension2){
        double area = ((dimension1 * dimension2) / 2);
        return area;
    }
}
