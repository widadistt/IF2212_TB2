import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import java.util.Random;

// model package

public class Sunflower extends Element implements MouseListener{
    private GamePanel gamePanel;
    private int endOrdinat;
    private int step = 5;
    private JPanel elmtPanel;
    
    public Sunflower(GamePanel gamePanel) {
        super(new Point(0,0));
        Random rnd = new Random();
        setOrigin(rnd.nextInt(900)+25, rnd.nextInt(500)+25);
        setEndordinat(rnd.nextInt(500)+25);
        //add to list of sunflower
        this.gamePanel = gamePanel;
        setImageIcon(ImageFactory.createImage(Image.SUNFLOWER));
        elmtPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(getImageIcon().getImage(), 0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT, null);
            }
        };
        elmtPanel.setSize(80,80);
        elmtPanel.setLocation(this.getOrigin().getAbsis(), this.getOrigin().getOrdinat());
        elmtPanel.addMouseListener(this);
        gamePanel.add(elmtPanel);
    }

    public int getEndOrdinat() {
        return endOrdinat;
    }

    public void setEndordinat(int endOrdinat) {
        this.endOrdinat = endOrdinat;
    }

    public void update() {
        if (this.getOrigin().getOrdinat() + step <= endOrdinat) {
            this.setOrigin(this.getOrigin().getAbsis(), this.getOrigin().getOrdinat() + step);
        } else {
            this.setOrigin(this.getOrigin().getAbsis(), this.getOrigin().getOrdinat() + step - endOrdinat);
        }
        elmtPanel.setLocation(this.getOrigin().getAbsis(), this.getOrigin().getOrdinat());
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        GamePanel.addSunflowerPoints(50);
        //GamePanel.remove(this);
        GamePanel.elmtList.remove(this);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}