import javax.swing.*;


public class SunflowerpointsNotEnoughException {
    public SunflowerpointsNotEnoughException(){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel message = new JLabel("Sunflower Points not enough!", JLabel.CENTER);
        p.add(message);
        f.add(p);
        f.setSize(200, 80);
        f.setResizable(false);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}