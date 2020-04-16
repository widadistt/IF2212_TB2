import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;

public class GameOpeningFrame extends javax.swing.JFrame {
   Image img = Toolkit.getDefaultToolkit().getImage("img/362210.jpg");
   public GameOpeningFrame () throws IOException {
      this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);
   //   setSize(900,1600);
   }
   public static void main(String[] args) throws Exception {
      new GameOpeningFrame();
   }
}