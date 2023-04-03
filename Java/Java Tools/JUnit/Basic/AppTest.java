
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test  
    public void test(){  
        try {
            assertEquals(10, App.check());
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }  
}
