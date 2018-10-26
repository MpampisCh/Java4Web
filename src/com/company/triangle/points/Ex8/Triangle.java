package com.company.triangle.points.Ex8;

class Triangle {

    private Point point1 = new Point(1, 1);
    private Point point2 = new Point(2, 2);
    private Point point3 = new Point(1, 3);

    private double getSide1Size(){
        return Math.sqrt(point1.getX()*point2.getX()+point1.getY()*point2.getY());
    }

    private double getSide2Size(){
        return Math.sqrt(point1.getX()*point3.getX()+point1.getY()*point3.getY());
    }

    private double getSide3Size(){
        return Math.sqrt(point2.getX()*point3.getX()+point2.getY()*point3.getY());
    }

    public double calculateTrianglesPerimeter(){
        return getSide1Size() + getSide2Size() + getSide3Size();
    }

    private double calculateAngle(double a, double b, double c){
        double aa = Math.pow(a,2);
        double bb = Math.pow(b,2);
        double cc = Math.pow(c,2);
        double denominator = 2*b*c;
        return Math.toDegrees(Math.acos( (bb+cc-aa)/denominator ));
    }

    private double getAngle1(){
        return calculateAngle(getSide1Size(),getSide2Size(),getSide3Size());
    }

    private double getAngle2(){
        return calculateAngle(getSide2Size(),getSide3Size(),getSide1Size());
    }

    private double getAngle3(){
        return calculateAngle(getSide3Size(),getSide1Size(),getSide2Size());
    }

    public boolean checkIfItIsATriangle() {
        return getAngle1() + getAngle2() + getAngle3() == 180;
    }
}
