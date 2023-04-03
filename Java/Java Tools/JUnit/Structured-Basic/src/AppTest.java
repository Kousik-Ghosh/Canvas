import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test  
    public void test(){  
        try {
            assertEquals(10, App.add(5,5));
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }  
}
