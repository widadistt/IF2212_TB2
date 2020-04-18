import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;

public class IsFilledException extends Exception{
    IsFilledException(){
        
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel message = new JLabel("Sudah Terisi", JLabel.CENTER);
        p.add(message);
        f.add(p);
        f.setSize(200, 80);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        // set timer
    }

    public static void main (String args[]){
        new IsFilledException();
    }
    
}