import javax.swing.JLabel;
import javax.swing.*;

public class LoseException extends Exception{
    String m;
    LoseException(){
        m = "You LOSE";
        // f = new JFrame();
        // JOptionPane.showMessageDialog(f,"You LOSE");
        // JPanel p = new JPanel();
        // JLabel message = new JLabel("You LOSE", JLabel.CENTER);
        // p.add(message);
        // f.add(p);
        // f.setSize(200, 80);
        // f.setResizable(false);
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setVisible(true);
    }

    public String getMessage(){
        return m;
    }
}

