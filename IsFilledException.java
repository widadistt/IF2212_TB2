import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;

public class IsFilledException extends Exception{
    String m;
    IsFilledException(){
        m = "This field is filled already!";
        // f = new JFrame();
        // JOptionPane.showMessageDialog(f,"This field is filled already!");
        // JPanel p = new JPanel();
        // JLabel message = new JLabel("This field is filled already!", JLabel.CENTER);
        // p.add(message);
        // f.add(p);
        // f.setSize(200, 80);
        // f.setResizable(false);
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setVisible(true);
        // set timer
    }

    public String getMessage(){
        return m;
    }

    public static void main (String args[]){
        new IsFilledException();
    }
    
}