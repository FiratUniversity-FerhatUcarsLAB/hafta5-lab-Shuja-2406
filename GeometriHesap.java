/*
 * Ad Soyad: [Shuja Ahmad Tariq]
 * Ogrenci No: [240541608]
 * Tarih: [07-11-2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class GeometricCalculator{
    // square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // rectangle
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
    public static double calculateRectanglePerimeter(double width, double height){
        return 2 * (width + height);
    }

    // circle
    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // triangle
    public static double calculateTrinangleArea(double base, double height) {
        return (base * height) / 2;
    }
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a+b+c;
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Geometric Shape Calculator === ");

        // square
        System.out.print("\nEnter side of square: ");
        double side = input.nextDouble();
        System.out.println("Square Area: "+calculateSquareArea(side));
        System.out.println("Square Perimeter: "+calculateSquarePerimeter(side));

        // rectangle
        System.out.print("\nEnter width of rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter height of rectanlge: ");
        double height = input.nextDouble();
        System.out.println("Rectangle Area: "+calculateRectangleArea(width, height));
        System.out.println("Rectangle Perimeter:"+calculateRectanglePerimeter(width, height));

        // circle
        System.out.print("\nEnter radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Circle Area: "+calculateCircleArea(radius));
        System.out.println("Circle Perimeter: "+calculateCirclePerimeter(radius));

        // triangle
        System.out.print("\nEnter base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triHeight = input.nextDouble();
        System.out.print("Enter side a of the triangle: ");
        double a = input.nextDouble();
        System.out.print("Enter side b of the triangle: ");
        double b = input.nextDouble();
        System.out.print("Enter side c of the triangle: ");
        double c = input.nextDouble();
        System.out.println("Triangle Area: "+calculateTrinangleArea(a, b));
        System.out.println("Triangle Perimeter: "+calculateTrianglePerimeter(a, b, c));

        input.close();



    }
}



=== Geometric Shape Calculator === 

Enter side of square: 3
Square Area: 9.0
Square Perimeter: 12.0

Enter width of rectangle: 2
Enter height of rectanlge: 6
Rectangle Area: 12.0
Rectangle Perimeter:16.0

Enter radius of the circle: 11
Circle Area: 380.1327110843649
Circle Perimeter: 69.11503837897544

Enter base of the triangle: 56
Enter the height of the triangle: 5
Enter side a of the triangle: 3
Enter side b of the triangle: 7
Enter side c of the triangle: 9
Triangle Area: 10.5
Triangle Perimeter: 19.0
PS D:\JAVA\Week 5\GeometriHesap> 
