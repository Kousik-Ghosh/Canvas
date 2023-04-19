package com.spring.demo;

/* Simple POJO */
public class Course {
    
    private int ID;
    private String Name;
    private String description;

    public Course(int iD, String name, String description) {
        ID = iD;
        Name = name;
        this.description = description;
    }
    
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course [ID=" + ID + ", Name=" + Name + ", description=" + description + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    

}
