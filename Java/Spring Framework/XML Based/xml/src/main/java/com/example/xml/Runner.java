package com.example.xml;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
   
    public static void main(String[] args) {
    

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
        Triangle t = (Triangle) context.getBean("triangle");
        System.out.println(t);
        context.close();
            
        
        
        
    }
    
}
