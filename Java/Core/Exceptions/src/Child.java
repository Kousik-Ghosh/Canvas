import java.io.IOException;

public class Child implements Parent {
    
    @Override
    public
    void method() throws IOException{
        if(true)
            throw new IOException("File issue");
    }

    // public void someMethod(){
    //     System.out.println("Will not throw Exception");
    // }

}
