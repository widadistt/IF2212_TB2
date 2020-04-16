import java.awt.EventQueue;

// app

public class App {
    public static void main(String[] args){
        //new GameOpeningFrame();

        EventQueue.invokeLater( () -> {
            new GameMainFrame();
        });
    }
}