import java.io.Serializable;

abstract class Person implements Facilities, Skills, Comparable<Employee>, Serializable{

    /* Serializable is a tagging interface.
     * An interface with no method.
     * Just to indicate that this class & its sub-classes
     * are serializable.
    */

    final private String Name;
    Person(String name){
        Name = name;
    }

    String getName(){
        return Name;
    }

    abstract String getDiscription();

}