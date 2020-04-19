import javax.swing.*;


public class SunflowerpointsNotEnoughException extends Exception {
    String m;
    public SunflowerpointsNotEnoughException(){
        m = "Sunflower Points not enough!";
        // f = new JFrame();
        // JOptionPane.showMessageDialog(f,"Sunflower Points not enough!");
/*         JPanel p = new JPanel();
        JLabel message = new JLabel("Sunflower Points not enough!", JLabel.CENTER);
        p.add(message);
        f.add(p);
        f.setSize(200, 80);
        f.setResizable(false);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
 */ }


    public String getMessage(){
        return m;
}
}