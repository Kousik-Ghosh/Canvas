
public class Runner {
    
    public static void main(String[] args) {
        
        Executive e = new Executive("Kosuik", 1000000, 100000, "LoBX");
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.getLOB());

        System.out.println(new Executive(null, 0, 0, null).isDeletable());
        System.out.println(new Manager(null, 0, 0).isDeletable());
        System.out.println(new Employee(null, 0).isDeletable());
    }

   

}
