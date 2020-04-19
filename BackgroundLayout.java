import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Graphics;

public class BackgroundLayout extends JPanel{
    private ImageIcon backgroundImage;

    BackgroundLayout(){
        this.backgroundImage = ImageFactory.createImage(Image.BACKGROUND);
        JLabel label = new JLabel() {
        protected void paintComponent(Graphics g) {
           super.paintComponent(g);
           g.drawImage(ImageFactory.createImage(Image.BACKGROUND).getImage(), 0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT, null);
           setVisible(true) ;
        }
     }; 
     label.setBounds(0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
     add(label);
}
    public static void main (String args[]){
        JFrame f = new JFrame();
        f.add(new BackgroundLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setSize(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
        f.setLayout(null);
        f.setVisible(true);
    }
}