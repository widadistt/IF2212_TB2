import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Graphics;

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
        add(new GamePanel());
        setTitle(Constants.TITLE);
        setIconImage(ImageFactory.createImage(Image.ICON).getImage());
        
        pack();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
        setLayout(null);
        // add(ArenaLayout.pGrid, BorderLayout.CENTER);
        // add(ArenaLayout.pPoint, BorderLayout.NORTH);
        // add(ArenaLayout.pAdd, BorderLayout.WEST);
        setVisible(true);
    }
    public static void main(String[] args) {  
        new GameMainFrame();  
        new Game(); 
           
    }  
}