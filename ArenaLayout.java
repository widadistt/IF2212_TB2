import java.awt.*;  
import javax.swing.*;  
  
public class ArenaLayout{  
JFrame f;  
Arena a;
public ArenaLayout(){

    f=new JFrame();  
    a = new Arena();
    
    //Panel Arena
    JPanel pGrid = new JPanel();
    
    //Panel AddPlant
    JPanel pAdd = new JPanel();
    
    //Panel Sunflower Points
    JPanel pPoint = new JPanel();
    
    
    // Buttons for Arena
//row1
    ArenaGrid b1 = new ArenaGrid(1,1);  
    ArenaGrid b2 = new ArenaGrid(2,1);  
    ArenaGrid b3 = new ArenaGrid(3,1);  
    ArenaGrid b4 = new ArenaGrid(4,1);  
    ArenaGrid b5 = new ArenaGrid(5,1);  
    ArenaGrid b6=new ArenaGrid(6,1);  
    ArenaGrid b7=new ArenaGrid(7,1);  
    ArenaGrid b8=new ArenaGrid(8,1);  
    ArenaGrid b9=new ArenaGrid(9,1); 
//row2
    ArenaGrid b10=new ArenaGrid(1,2);   
    ArenaGrid b11=new ArenaGrid(2,2);  
    ArenaGrid b12=new ArenaGrid(3,2);  
    ArenaGrid b13=new ArenaGrid(4,2);  
    ArenaGrid b14=new ArenaGrid(5,2);  
    ArenaGrid b15=new ArenaGrid(6,2);  
    ArenaGrid b16=new ArenaGrid(7,2);  
    ArenaGrid b17=new ArenaGrid(8,2);  
    ArenaGrid b18=new ArenaGrid(9,2);
//row3
    ArenaGrid b19=new ArenaGrid(1,3); 
    ArenaGrid b20=new ArenaGrid(2,3);   
    ArenaGrid b21=new ArenaGrid(3,3);  
    ArenaGrid b22=new ArenaGrid(4,3);  
    ArenaGrid b23=new ArenaGrid(5,3);  
    ArenaGrid b24=new ArenaGrid(6,3);  
    ArenaGrid b25=new ArenaGrid(7,3);  
    ArenaGrid b26=new ArenaGrid(8,3);  
    ArenaGrid b27=new ArenaGrid(9,3);
//row4
    ArenaGrid b28=new ArenaGrid(1,4);  
    ArenaGrid b29=new ArenaGrid(2,4);  
    ArenaGrid b30=new ArenaGrid(3,4);  
    ArenaGrid b31=new ArenaGrid(4,4);  
    ArenaGrid b32=new ArenaGrid(5,4);  
    ArenaGrid b33=new ArenaGrid(6,4);  
    ArenaGrid b34=new ArenaGrid(7,4);  
    ArenaGrid b35=new ArenaGrid(8,4);  
    ArenaGrid b36=new ArenaGrid(9,4);
//row5
    ArenaGrid b37=new ArenaGrid(1,5);  
    ArenaGrid b38=new ArenaGrid(2,5);  
    ArenaGrid b39=new ArenaGrid(3,5);  
    ArenaGrid b40=new ArenaGrid(4,5);     
    ArenaGrid b41=new ArenaGrid(5,5);  
    ArenaGrid b42=new ArenaGrid(6,5);  
    ArenaGrid b43=new ArenaGrid(7,5);  
    ArenaGrid b44=new ArenaGrid(8,5);  
    ArenaGrid b45=new ArenaGrid(9,5); 
    
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

    Point pSelect;
    char type;
    
    

}  
public static void main(String[] args) {  
    new ArenaLayout();  
}  
}  