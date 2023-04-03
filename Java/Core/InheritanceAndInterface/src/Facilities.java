

public interface Facilities{

    int methodCount = 3;
    public void hasLaptop();
    public void sameNameInterfaceMethod();
    default public void facilitiesForAll(){
        System.out.println("All will get sick leaves");
    }

}
