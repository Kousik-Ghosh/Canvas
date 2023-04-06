package com.example.xml;

public class Triangle {
    
    public Point pointA;
    public Point pointB;
    public Point pointC;
    
    public Point getPointA() {
        return pointA;
    }
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
    public Point getPointC() {
        return pointC;
    }
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
    }
    
}
