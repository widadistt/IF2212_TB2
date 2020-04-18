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
        ArenaLayout a = new ArenaLayout();
        setTitle(Constants.TITLE);
        setIconImage(ImageFactory.createImage(Image.ICON).getImage());
        
        pack();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT);
        setLayout(null);
        this.add(ArenaLayout.pGrid, BorderLayout.CENTER);
        this.add(ArenaLayout.pPoint, BorderLayout.NORTH);
        this.add(ArenaLayout.pAdd, BorderLayout.WEST);
        setVisible(true);
    }
    public static void main(String[] args) {  
        new GameMainFrame();      
    }  
}