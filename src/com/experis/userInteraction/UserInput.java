package com.experis.userInteraction;

import com.experis.menu.MenuDisplayer;
import com.experis.shapes.Circle;
import com.experis.shapes.Rectangle;
import com.experis.shapes.Square;
import com.experis.shapes.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);

    ArrayList<String> shapeDetails = new ArrayList<>();

    private int userChoice;

    public void handleUserChoice(){
        userChoice = input.nextInt();
        switch(userChoice) {
            case 1:
                String rectangleDetails = getRectangleDetails();
                shapeDetails.add(rectangleDetails);
                System.out.println(rectangleDetails);
                break;
            case 2:
                String circleDetails = getCircleDetails();
                shapeDetails.add(circleDetails);
                System.out.println(circleDetails);
                break;
            case 3:
                String squareDetails = getSquareDetails();
                shapeDetails.add(squareDetails);
                System.out.println(squareDetails);
                break;
            case 4:
                String triangleDetails = getTriangleDetails();
                shapeDetails.add(triangleDetails);
                System.out.println(triangleDetails);
                break;
            case 5:
                for (String shape : shapeDetails) {
                    System.out.println(shape);
                }
                break;
            case 6:
                System.out.println("Closing the program...");
                break;
            default:
                System.out.println("Incorrect selection!");
                MenuDisplayer.displayMenuOptions();


        }
    }

    private String getRectangleDetails(){
        System.out.println("Please enter the first dimension: ");
        int dimension1 = input.nextInt();
        System.out.println("Please enter the second dimension: ");
        int dimension2 = input.nextInt();
        double rectangleArea = Rectangle.calculateArea(dimension1, dimension2);
        return "Rectangle with dimensions " + dimension1 + " x " + dimension2 +
                " has an area of: " + rectangleArea + " square units.";

    }

    private String getCircleDetails() {
        System.out.println("Please enter the radius: ");
        int radius = input.nextInt();
        double circleArea = Circle.calculateArea(radius);
        return "Circle with radius " + radius + " has an area of: " + circleArea + " square units.";

    }

    private String getSquareDetails() {
        System.out.println("Please enter the dimension: ");
        int dimension = input.nextInt();
        double squareArea = Square.calculateArea(dimension);
        return "Square with dimensions of " + dimension + "has an area of: " + squareArea + " square units.";
    }

    private String getTriangleDetails() {
        System.out.println("Please enter the first dimension: ");
        int baseDimension = input.nextInt();
        System.out.println("Please enter the second dimension: ");
        int heightDimension = input.nextInt();
        double triangleArea = Triangle.calculateArea(baseDimension, heightDimension);
        return "Rectangle with the base and height of: " + baseDimension + " x " + heightDimension +
                " has an area of " + triangleArea + " square units.";
    }
    public int getUserChoice() {
        return userChoice;
    }
}
