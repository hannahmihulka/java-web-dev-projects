package org.launchcode;
import org.launchcode.Circle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
////
        double pi = 3.14159;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is: " + area);


        double circleArea = Circle.getArea(radius);
        System.out.println("The area of a circle using Circle class is: " + circleArea);
    }
}

