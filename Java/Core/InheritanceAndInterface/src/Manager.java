

class Manager extends Employee {

    private int Bonus;

    Manager(String name, int salary, int bonus){
        super(name, salary);
        this.Bonus = bonus;
    }

    @Override public int getSalary() {
        int baseSalary = super.getSalary();
        return baseSalary + this.Bonus;
    }

    public String managerSpecific(){
        return "This is manager Specific method";
    }

    /* 
     * FOLLOWING @OVERRIDE ARE NOT MANDATORY AS THIS IS AT LEVEL 
     * OF GRAND-CHILD OF ABSTRACT CLASS PERSON. BUT CAN BE IMPLEMENTED SHOULD THE NEED ARISE
     * EXCEPT THE toString METHOD, IT IS FROM Object CLASS
    */

    @Override
    public String toString(){
        return super.getName()+" "+getSalary();
    }

    @Override
    public int compareTo(Employee o) {
        int oSalary = o.getSalary();
        return -1 * Double.compare(this.getSalary(), oSalary);
    }

    @Override
    String getDiscription() {
        return "Disc: This is a Manager";
    }

    @Override
    public void hasLaptop() {
        System.out.println("Manager has got laptop");
    }

    @Override
    public void knowsJava() {
        System.out.println("Manager knows java");
    }

    boolean isDeletable(){
        if(this instanceof Deletable){
            return true;
        }
        return false;
    }
    
}
    

    



