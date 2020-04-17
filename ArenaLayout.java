import java.awt.*;  
import javax.swing.*;  
  
public class ArenaLayout{  
JFrame f;  
Arena a;
public ArenaLayout(){

    f=new JFrame();  
//    a = new Arena();
    
    //Panel Arena
    JPanel pGrid = new JPanel();
    
    //Panel AddPlant
    JPanel pAdd = new JPanel();
    
    //Panel Sunflower Points
    JPanel pPoint = new JPanel();
    
    
    // Buttons for Arena
    JButton b1=new JButton();  
    JButton b2=new JButton();  
    JButton b3=new JButton();  
    JButton b4=new JButton();  
    JButton b5=new JButton();  
    JButton b6=new JButton();  
    JButton b7=new JButton();  
    JButton b8=new JButton();  
    JButton b9=new JButton(); 
    JButton b10=new JButton();   
    JButton b11=new JButton();  
    JButton b12=new JButton();  
    JButton b13=new JButton();  
    JButton b14=new JButton();  
    JButton b15=new JButton();  
    JButton b16=new JButton();  
    JButton b17=new JButton();  
    JButton b18=new JButton();  
    JButton b19=new JButton(); 
    JButton b20=new JButton();   
    JButton b21=new JButton();  
    JButton b22=new JButton();  
    JButton b23=new JButton();  
    JButton b24=new JButton();  
    JButton b25=new JButton();  
    JButton b26=new JButton();  
    JButton b27=new JButton();  
    JButton b28=new JButton();  
    JButton b29=new JButton();  
    JButton b30=new JButton();  
    JButton b31=new JButton();  
    JButton b32=new JButton();  
    JButton b33=new JButton();  
    JButton b34=new JButton();  
    JButton b35=new JButton();  
    JButton b36=new JButton();  
    JButton b37=new JButton();  
    JButton b38=new JButton();  
    JButton b39=new JButton();  
    JButton b40=new JButton();     
    JButton b41=new JButton();  
    JButton b42=new JButton();  
    JButton b43=new JButton();  
    JButton b44=new JButton();  
    JButton b45=new JButton(); 
    
    b1.setOpaque(false);  
    b2.setOpaque(false);  
    b3.setOpaque(false);  
    b4.setOpaque(false);  
    b5.setOpaque(false);  
    b6.setOpaque(false);  
    b7.setOpaque(false);  
    b8.setOpaque(false);  
    b9.setOpaque(false);  
    b10.setOpaque(false);  
    
    pGrid.add(b1);pGrid.add(b2);pGrid.add(b3);pGrid.add(b4);pGrid.add(b5);  
    pGrid.add(b6);pGrid.add(b7);pGrid.add(b8);pGrid.add(b9);pGrid.add(b10);  
    pGrid.add(b11);pGrid.add(b12);pGrid.add(b13);pGrid.add(b14);pGrid.add(b15);  
    pGrid.add(b16);pGrid.add(b17);pGrid.add(b18);pGrid.add(b19);pGrid.add(b20);
    pGrid.add(b21);pGrid.add(b22);pGrid.add(b23);pGrid.add(b24);pGrid.add(b25);  
    pGrid.add(b26);pGrid.add(b27);pGrid.add(b28);pGrid.add(b29);pGrid.add(b30);
    pGrid.add(b31);pGrid.add(b32);pGrid.add(b33);pGrid.add(b34);pGrid.add(b35);  
    pGrid.add(b36);pGrid.add(b37);pGrid.add(b38);pGrid.add(b39);pGrid.add(b40);
    pGrid.add(b41);pGrid.add(b42);pGrid.add(b43);pGrid.add(b44);pGrid.add(b45);
    
    //setting grid layout of 5 rows and 9 columns  
    pGrid.setLayout(new GridLayout(5,9));  
    
    //Buttons for pAdd
    //    ImageIcon iconPS = new ImageIcon(new ImageIcon("img\\Peashooter.png").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
    ImageIcon iconPS = new ImageIcon("img\\Peashooter.png");
    ImageIcon iconSP = new ImageIcon("img\\Snow_Pea1.png");
    
    
    // set icon size
    // Image image = iconPS.getImage(); // transform it 
    // Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    // iconPS = new ImageIcon(newimg);  // transform it back
    
    // image = iconSP.getImage(); // transform it 
    // newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    // iconSP = new ImageIcon(newimg);  // transform it back
    
    JButton addPS=new JButton(iconPS);  
    JButton addSP=new JButton(iconSP); 
    
    addPS.setSize(150, 75);
    addSP.setSize(150, 75);
    
    JLabel labelPS = new JLabel("Peashooter : 350");
    JLabel labelSP = new JLabel("Snowpea : 600");
    
    labelSP.setSize(150, 10);
    labelPS.setSize(150, 10);
    
    pAdd.add(addPS);
    pAdd.add(addSP);
    pAdd.add(labelPS);
    pAdd.add(labelSP);
    
    pAdd.setLayout(new GridLayout(2,2));
    
    ImageIcon PvsZ = new ImageIcon("img\\Peashooter.png");
    JLabel labelPoint = new JLabel("SunFlower Points : ");
    
    pPoint.add(labelPoint);
    
    f.add(pGrid, BorderLayout.CENTER);
    f.add(pPoint, BorderLayout.NORTH);
    f.add(pAdd, BorderLayout.SOUTH);

    pGrid.setBounds(450, 250, 900, 500);
    pAdd.setBounds(500, 100, 300, 100);
    f.setSize(900,600);  
    f.setVisible(true);
    //    f.setLayout(new GridLayout(3,1,0,10));
    
    //    BufferedImage myImage = ImageIO.read("img\\Background2.jpg");
    //    f.setContentPane(new ImagePanel(myImage));
    pGrid.setSize(900,500);
    pAdd.setSize(300, 100);
    pPoint.setSize(600,100);
}  
    public static void main(String[] args) {  
        new ArenaLayout();  
    }  
}  