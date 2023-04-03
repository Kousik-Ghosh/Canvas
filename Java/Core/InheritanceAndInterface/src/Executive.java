

public class Executive extends Manager implements Deletable{

    private String LOB;

    Executive(String name, int salary, int bonus, String lob){
        super(name, salary, bonus);
        this.LOB = lob;
    }

    public String getLOB(){
        return this.LOB;
    }

    public String executiveSpecific(){
        return "This is executive Specific method";
    }

    /* 
     * FOLLOWING @OVERRIDE ARE NOT MANDATORY AS THIS IS AT LEVEL 
     * OF GRAND-CHILD OF ABSTRACT CLASS PERSON. BUT CAN BE IMPLEMENTED SHOULD THE NEED ARISE
     * EXCEPT THE toString METHOD, IT IS FROM Object CLASS
    */

    @Override
    public String toString(){
        return super.getName()+" "+super.getSalary()+" "+this.LOB;
    }

    // NO NEED TO IMPLEMENT compareTo(Employee o) METHOD HERE AS THE LOGIC IS SAME ARE MANAGER CLASS

    @Override
    String getDiscription() {
        return "Disc: This is a Executive";
    }

    @Override
    public void hasLaptop() {
        System.out.println("Executive has got laptop");
    }

    @Override
    public void knowsJava() {
        System.out.println("Executive knows java");
    }

    boolean isDeletable(){
        if(this instanceof Deletable){
            return true;
        }
        return false;
    }
    
}
