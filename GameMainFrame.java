import javax.swing.JFrame;

// ui package

public class GameMainFrame extends JFrame{

    public GameMainFrame(){
        initializeLayout();
    }

    private void initializeLayout(){
        add(new ArenaLayout());
        setTitle(Constants.TITLE);
        setIconImage(ImageFactory.createImage(Image.ICON).getImage());

        pack();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    public static void main(String[] args) {  
        new GameMainFrame();      
    }  
}