package com.example.java;

import org.springframework.beans.factory.annotation.Autowired;

/* Note: No @Component is needed here to make it a bean 
 *       cause in AppConfig we have mentioned it.
*/
public class Triangle {
    
    public Point pointA;
    public Point pointB;
    public Point pointC;

    @Autowired
    public Point pointOutsideTriangle;

    @Autowired
    public TriangleType triangleTypeBasedOnAngle;

    @Autowired
    public TriangleType triangleTypeBasedOnSides;
    
    public Point getPointA() {
        return pointA;
    }
    @Autowired
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    @Autowired
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
    public Point getPointC() {
        return pointC;
    }
    @Autowired
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
 
    @Override
    public String toString() {
        return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", pointOutsideTriangle="
                + pointOutsideTriangle + ", triangleTypeBasedOnAngle=" + triangleTypeBasedOnAngle
                + ", triangleTypeBasedOnSides=" + triangleTypeBasedOnSides + "]";
    }
    
}
