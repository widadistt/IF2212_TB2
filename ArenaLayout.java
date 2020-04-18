import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
  
public class ArenaLayout extends JFrame{  
    public static JPanel pGrid = new JPanel();    //Panel Arena
    public static JPanel pAdd = new JPanel();     //Panel AddPlant
    public static JPanel pPoint = new JPanel();    //Panel Sunflower Points

public ArenaLayout(){

    setTitle(Constants.TITLE);
        setIconImage(ImageFactory.createImage(Image.ICON).getImage());
        
        pack();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
        
    // Buttons for Arena
    pGrid = new JPanel();    
    pAdd = new JPanel();     
    pPoint = new JPanel(); 
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
    b11.setOpaque(false);  
    b12.setOpaque(false);  
    b13.setOpaque(false);  
    b14.setOpaque(false);  
    b15.setOpaque(false);  
    b16.setOpaque(false);  
    b17.setOpaque(false);  
    b18.setOpaque(false);  
    b19.setOpaque(false);  
    b20.setOpaque(false);   
    b21.setOpaque(false);  
    b22.setOpaque(false);  
    b23.setOpaque(false);  
    b24.setOpaque(false);  
    b25.setOpaque(false);  
    b26.setOpaque(false);  
    b27.setOpaque(false);  
    b28.setOpaque(false);  
    b29.setOpaque(false);  
    b30.setOpaque(false);  
    b31.setOpaque(false);  
    b32.setOpaque(false);  
    b33.setOpaque(false);  
    b34.setOpaque(false);  
    b35.setOpaque(false);  
    b36.setOpaque(false);  
    b37.setOpaque(false);  
    b38.setOpaque(false);  
    b39.setOpaque(false);  
    b40.setOpaque(false);  
    b41.setOpaque(false);  
    b42.setOpaque(false);  
    b43.setOpaque(false);  
    b44.setOpaque(false);  
    b45.setOpaque(false);  
    b1.setContentAreaFilled(false); 
    b2.setContentAreaFilled(false); 
    b3.setContentAreaFilled(false); 
    b4.setContentAreaFilled(false); 
    b5.setContentAreaFilled(false); 
    b6.setContentAreaFilled(false); 
    b7.setContentAreaFilled(false); 
    b8.setContentAreaFilled(false); 
    b9.setContentAreaFilled(false); 
    b10.setContentAreaFilled(false); 
    b11.setContentAreaFilled(false); 
    b12.setContentAreaFilled(false); 
    b13.setContentAreaFilled(false); 
    b14.setContentAreaFilled(false); 
    b15.setContentAreaFilled(false); 
    b16.setContentAreaFilled(false); 
    b17.setContentAreaFilled(false); 
    b18.setContentAreaFilled(false); 
    b19.setContentAreaFilled(false); 
    b20.setContentAreaFilled(false);  
    b21.setContentAreaFilled(false); 
    b22.setContentAreaFilled(false); 
    b23.setContentAreaFilled(false); 
    b24.setContentAreaFilled(false); 
    b25.setContentAreaFilled(false); 
    b26.setContentAreaFilled(false); 
    b27.setContentAreaFilled(false); 
    b28.setContentAreaFilled(false); 
    b29.setContentAreaFilled(false); 
    b30.setContentAreaFilled(false); 
    b31.setContentAreaFilled(false); 
    b32.setContentAreaFilled(false); 
    b33.setContentAreaFilled(false); 
    b34.setContentAreaFilled(false); 
    b35.setContentAreaFilled(false); 
    b36.setContentAreaFilled(false); 
    b37.setContentAreaFilled(false); 
    b38.setContentAreaFilled(false); 
    b39.setContentAreaFilled(false); 
    b40.setContentAreaFilled(false); 
    b41.setContentAreaFilled(false); 
    b42.setContentAreaFilled(false); 
    b43.setContentAreaFilled(false); 
    b44.setContentAreaFilled(false); 
    b45.setContentAreaFilled(false);
    
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
    pAdd.add(labelPS);
    pAdd.add(addSP);
    pAdd.add(labelSP);
    
    pAdd.setLayout(new GridLayout(4,1));
    
    ImageIcon PvsZ = new ImageIcon("img\\Peashooter.png");
    JLabel labelPoint = new JLabel("SunFlower Points : ");
    
    pPoint.add(labelPoint);    
    pGrid.setBounds(450, 250, 900, 500);
    pAdd.setBounds(500, 100, 300, 100);
    this.setSize(900,600);  
    this.setVisible(true);
    //    f.setLayout(new GridLayout(3,1,0,10));
    //    BufferedImage myImage = ImageIO.read("img\\Background2.jpg");
    //    f.setContentPane(new ImagePanel(myImage));
    pGrid.setSize(900,500);
    pAdd.setSize(100, 100);
    pPoint.setSize(600,100);    

    this.add(pGrid, BorderLayout.CENTER);
    this.add(pPoint, BorderLayout.NORTH);
    this.add(pAdd, BorderLayout.WEST);

    this.setResizable(false);

    // set action to addButton
    addPS.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            addButtonActionPerformed(evt, "P") ;
        }
    });
    addSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            addButtonActionPerformed(evt, "S") ;
        }
    });    


    // set addActionListener to each ArenaGrid
    b1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b2.getOrigin()) ;
        }
    });

    b3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b3.getOrigin()) ;
        }
    });

    b4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b4.getOrigin()) ;
        }
    });

    b5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b11.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b13.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });
    b14.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b15.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b16.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b17.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b18.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b19.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b20.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b21.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b22.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b23.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b24.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b25.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b26.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b27.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b28.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b29.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b30.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b31.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });
    b32.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b33.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b34.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b35.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b36.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b37.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b38.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b39.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b40.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b41.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });
    b42.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b43.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });

    b44.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });
    b45.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt)  {
            arenaGridActionPerformed(evt, b1.getOrigin()) ;
        }
    });
}  
    public void arenaGridActionPerformed(java.awt.event.ActionEvent evt, BoardPoint p) {                                              
         //System.out.println("haihaihai" + p.getOrdinat() + " " + p.getAbsis());  
        Game.addPlants(p,Game.type);    
    }
    public void addButtonActionPerformed(java.awt.event.ActionEvent evt, String s) {                                              
        //System.out.println("haihaihai" + p.getOrdinat() + " " + p.getAbsis());  
       Game.type = s;    
   }
    public static void main(String[] args) {  
        new ArenaLayout();      
    }  
}  