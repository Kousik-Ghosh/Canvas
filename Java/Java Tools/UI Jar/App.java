import java.awt.*; 
import javax.swing.*;
/**
* @version 1.34 2018-04-10 * @author Cay Horstmann
*/
public class App {
    public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
    var frame = new SimpleFrame(); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
    }); }
    }