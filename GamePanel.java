// ui package

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.Timer;

public class GamePanel extends JPanel {
    private ImageIcon backgroundImage; 
    private Timer timer;
    public static List<Element> elements;
    private boolean inGame;

    public GamePanel() {
        initializeVariables();
        initializeLayout();
    }

    private void initializeVariables() {
        this.backgroundImage = ImageFactory.createImage(Image.BACKGROUND);
        timer =  new Timer(Constants.GAME_SPEED, new GameLoop(this));
        this.timer.start();
    }

    private void initializeLayout() {
        setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));

    }

    private void drawElement(Graphics g) {
        if (inGame){
            for (Element elmt: elements){
                g.drawImage(ImageFactory.createImage(Image.elmt), elmt.getX(), elmt.getY(), this);
            }
        } else {
            if (timer.isRunning()){
                timer.stop();
            }
        }

        Toolkit.getDefaultToolkit().sync();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(backgroundImage.getImage(), 0, 0,this.getWidth(), this.getHeight(), null);
        System.out.println("REPAINT");

        doDrawing(g);
    }

    public void doOneLoop() {
        update();
        repaint();
    }

    public void update() {
        System.out.println("UPDATE");
    }
}