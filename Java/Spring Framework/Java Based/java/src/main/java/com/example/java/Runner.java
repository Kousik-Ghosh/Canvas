package com.example.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
   
    public static void main(String[] args) {
        /* This is pure java based config. No config.xml file is there
         * Instead we have a AppConfig.java that defines all our beans.
        */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        /* t1 and t2 is singleton (same) object so are the pointA, pointB, pointC, pointOutsideTriangle
         * but not triangleType
        */
        Triangle t1 = (Triangle) context.getBean(Triangle.class); 
        System.out.println("---------------------------------------------");
        System.out.println(t1);

        /* Though here we are changing t1's pointA's x and y
         * all the points i.e pointA, pointB, pointC, pointOutsideTriangle
         * will change to (4,8).
        */
        t1.pointA.x = 4;
        t1.pointA.y = 8;
        
        System.out.println(t1);


        /* Since the triangleType is of @Scope(scopeName = "prototype")
         * triangleTypeBasedOnAngle and triangleTypeBasedOnSides will be 2 separate
         * objects of TriangleType.
        */
        t1.triangleTypeBasedOnAngle.type = "Acute";
        t1.triangleTypeBasedOnSides.type = "Equilaterral";

        System.out.println(t1);



        context.close();
    }
    
}
