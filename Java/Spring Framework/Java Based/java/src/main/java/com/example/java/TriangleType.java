package com.example.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* Here we made it @Compoent so AppConfig.java will not be
 * creating a bean for this class. Though we can define it there if
 * we must.
*/
@Component

/* This annotaion is making non-singleton beans(object)
 * i.e. everytime someone @autowire this class variable
 * a new object is going to be created.
 * This can be used in AppConfig.java as well if needed.
*/
@Scope(scopeName = "prototype")
public class TriangleType {
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TriangleType [type=" + type + "]";
    }
    
}
