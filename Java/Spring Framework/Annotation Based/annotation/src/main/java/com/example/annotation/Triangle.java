package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* This @Component annotation creats a bean of this class
 * as "triangle". Basicaly what a <bean/> tag does in config.xml
 * i.e. <bean id = "triangle" class="com.example.xml.Triangle">
*/
@Component
public class Triangle {
    
    public Point pointA;
    public Point pointB;
    public Point pointC;

    /* This is referenced-based-@Autowired annotation is going to look for any bean
     * with id="pointOutSideTriangle" and class="Point" in the xml config file.
     * Since this class is @Component so not <bean/> is there in
     * the config.xml file, thus, this tag is doing the job of <parameter/> tag.
     * Note: Spring is smart enough to understand is this a variable reference
     *       for variable "pointOutSideTriangle"
    */
    @Autowired
    public Point pointOutSideTriangle;
    
    public Point getPointA() {
        return pointA;
    }
    /* This is method-based-@Autowired annotation is going to look for any bean
     * with id="pointA" and class="Point" in the xml config file.
     * Since this class is @Component so not <bean/> is there in
     * the config.xml file, thus, this tag is doing the job of <parameter/> tag.
     * Note: Spring is smart enough to understand is this a setter-method
     *       for variable "pointA"
    */
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
        return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", pointOutSideTriangle="
                + pointOutSideTriangle + "]";
    }

    
}
