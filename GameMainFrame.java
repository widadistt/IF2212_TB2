import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.Graphics;
import java.awt.*;  
import javax.swing.*;
// ui package

public class GameMainFrame extends JFrame{
    private boolean isStart;

    public GameMainFrame(){
        initializeVariables();
        initializeLayout();
    }

    private void initializeVariables() {
        isStart = false;
    }

    private void initializeLayout(){
        add(new GamePanel(new JLabel()));
        setTitle(Constants.TITLE);
        setIconImage(ImageFactory.createImage(Image.ICON).getImage());
        
        pack();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
        setLayout(null);
        
        JFrame f = new ArenaLayout();        
        add(ArenaLayout.pGrid, BorderLayout.CENTER);
        add(ArenaLayout.pPoint, BorderLayout.NORTH);
        add(ArenaLayout.pAdd, BorderLayout.WEST);
        setVisible(true);
    }
    public static void main(String[] args) {  
        new GameMainFrame();  
        new Game(); 
           
    }  
}