import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class GameOpeningFrame extends JFrame {
   private boolean isStart;
   private GameMainFrame gmf;
   
   public GameOpeningFrame(){
      initializeVariables();
      initializeLayout();
   }
   
   private void initializeVariables() {
      isStart = false;
   }
   
   private void initializeLayout(){
      setTitle(Constants.TITLE);
      setIconImage(ImageFactory.createImage(Image.ICON).getImage());
      setVisible(true);

      JButton openingButton = new JButton() {
         protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(ImageFactory.createImage(Image.OPENING).getImage(), 0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT, null);
         }
      }; 
      openingButton.setBounds(0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
      add(openingButton);
      openingButton.addActionListener(new ActionListener(){  
         public void actionPerformed(ActionEvent e){  
            gmf = new GameMainFrame();
            gmf.setVisible(true);
            //this.add(gmf);
            setVisible(false);
         }
      });

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //setLocationRelativeTo(null);
      setResizable(false);
      setSize(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
      setLayout(null);
   }
/*    public static void main(String[] args) {  
      new GameOpeningFrame();   
         
  }  */
}