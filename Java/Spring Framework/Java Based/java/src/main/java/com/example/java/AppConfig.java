package com.example.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* This annotaions informs the spring framework that this 
 * is a config java file.
*/
@Configuration
@ComponentScan(basePackages = "com.example.java")
public class AppConfig {
    
    /* This annotation tell the framework that
     * creating a bean with id="triangle" (taken from the return type)
     * for the class="com.example.java.Triangle"
     * i.e. <bean id="triangle" class="com.example.java.Triangle"/>
     * 
     * This follows singleton pattern
     * Constructor based DI, called by main.
    */
    @Bean
    public Triangle getTriangle(){
        return new Triangle();
    }

    /* This annotation tell the framework that
     * creating a bean with id="point" (taken from the return type)
     * for the class="com.example.java.Point"
     * i.e. <bean id="point" class="com.example.java.Point"/>
     * 
     * One problem here is that this is singleton in nature.
     * All reference in Triangle object of Points will have the same object.
     * cause the mapping here is with return type not variable reference name;
     * 
     * Constructor based DI for Point
     * Setter based DI for Triangle's Point variable because it used
     * setters of Point variable in Triangle ex:
     * @Autowired
        public void setPointA(Point pointA) {
        this.pointA = pointA;
        }
    */
    @Bean
    public Point getPoint(){
        return new Point(10, 10);
    }

}
