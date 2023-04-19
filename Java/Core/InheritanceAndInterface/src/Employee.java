

class Employee extends Person {
    
    private int Salary;

    Employee(String name, int salary){
        super(name);
        this.Salary = salary;
    }

    public void setSalary(int salary){
        this.Salary = salary;
    }

    public int getSalary(){
        return this.Salary;
    }
    
    /* 
     * FOLLOWING @OVERRIDE ARE MANDATORY AS THIS IS IMIDIATE CHILD OF ABSTRACT CLASS Person.
     * EXCEPT THE toString METHOD, IT IS FROM Object CLASS
    */

    @Override
    public String toString(){
        return super.getName()+" "+Salary;
    }

    @Override
    public int compareTo(Employee o) {
        int oSalary = o.getSalary();
        return -1 * Double.compare(this.Salary, oSalary);
    }

    @Override
    String getDiscription() {
        return "Disc: This is a Employee";
    }

    @Override
    public void hasLaptop() {
        System.out.println("Employee has got laptop");
    }

    @Override
    public void knowsJava() {
        System.out.println("Employee knows java");
    }

    /* BELOW sameNameInterfaceMethod IS FROM Facilities interface as it is implemented first in Person class*/
    @Override
    public void sameNameInterfaceMethod() {
        System.out.println(Facilities.methodCount);
        System.out.println(Skills.methodCount);
    }

    boolean isDeletable(){
        if(this instanceof Deletable){
            return true;
        }
        return false;
    }
    

}