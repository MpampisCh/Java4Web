package main.java.triangle;


// Triangle perimeter


public class Ex8 {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        if (!triangle.checkIfItIsATriangle()){
            System.out.println("This is not a java.triangle but anyway...");
        }

        System.out.println("The perimeter is : " + triangle.calculateTrianglesPerimeter());
    }
}
