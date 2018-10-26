package com.company.triangle.points.Ex8;


// Triangle perimeter


public class Ex8 {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        if (!triangle.checkIfItIsATriangle()){
            System.out.println("This is not a triangle but anyway...");
        }

        System.out.println("The perimeter is : " + triangle.calculateTrianglesPerimeter());
    }
}
