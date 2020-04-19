// ui package

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.Timer;

public class GamePanel extends JPanel {
    private ImageIcon backgroundImage;
    private int sunflowerPoints;
    private Timer timer;
    public static List<Element> elmtList;
    private boolean inGame;
    public static boolean isShot;
    private SunflowerInjector sunflowerInjector;
    private JLabel sunflowerBoard;

    public GamePanel(JLabel sunflowerBoard) {
        initializeVariables();
        initializeLayout();
        this.sunflowerBoard = sunflowerBoard;
    }

    private void initializeVariables() {
        //this.backgroundImage = ImageFactory.createImage(Image.BACKGROUND);
        sunflowerPoints = 3000;
        timer =  new Timer(Constants.GAME_SPEED, new GameLoop(this));
        this.timer.start();
        sunflowerInjector = new SunflowerInjector(this);
        sunflowerInjector.start();
		elmtList = new ArrayList<Element>();
		inGame = true;
		//setBackground(new Color(0,0,0,0));
        setOpaque(false);

        //DEBUG
		elmtList.add(new RobotZombie(4,4));
		elmtList.add(new RobotZombie(4,3));
		elmtList.add(new RobotZombie(4,2));
		elmtList.add(new RobotZombie(4,1));
		elmtList.add(new RobotZombie(4,0));
    }

    private void initializeLayout() {
        addKeyListener(new GameEventListener(this));

        setFocusable(true);
        setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
    }

    public int getSunflowerPoints() {
        return sunflowerPoints;
    }

    public void setSunflowerPoints (int sunflowerPoint) {
        sunflowerPoint = sunflowerPoint;
        // set sunScoreboard.setText(String.valueOf(sunScore));
    }

    public static void addSunflowerPoints (int sunflowerPoint) {
        sunflowerPoint += sunflowerPoint;
    }

    private void drawElement(Graphics g) {
        if (inGame){
            for (Element elmt: elmtList){
                if (elmt.getOrigin().getAbsis() <= Constants.BOARD_WIDTH) {
                    switch (elmt.getType()) {
                        case 'P':
                            g.drawImage(ImageFactory.createImage(Image.PEASHOOTER).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                            break;

                        case 'S':
                            g.drawImage(ImageFactory.createImage(Image.SNOWPEA).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                            break;

                        case 'R':
                            g.drawImage(ImageFactory.createImage(Image.ROBOT_ZOMBIE).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                            break;

                        case 'C':
                            g.drawImage(ImageFactory.createImage(Image.CRAZY_ZOMBIE).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                            break;

                        case 'F':
                            g.drawImage(ImageFactory.createImage(Image.SUNFLOWER).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);    
                            break;

                        case '-':
                            g.drawImage(ImageFactory.createImage(Image.PEASHOOTER_BULLET).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                            break;
                            
                        default:
                            break;
                    }
                }
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

        g.drawImage(ImageFactory.createImage(Image.BACKGROUND).getImage(), 0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT, null);
        System.out.println("REPAINT");

        drawElement(g);
    }

    public void doOneLoop() {
        update();
        repaint();
    }

    public void update() {
        System.out.println("UPDATE");
        // plant shot, move zombie;
        //this.Plant.move();
    }

    public void keyReleased(KeyEvent e) {
        //this.Plant.keyReleased(e);
        System.out.println("PRESSED");
    }

    public void keyPressed(KeyEvent e) {
        //this.Plant.keyReleased(e);
        System.out.println("RELEASED");
        // if user press 'SPACE' then the game skip/update
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE){
            // update /skip
            if (inGame) {
                doOneLoop();
            }
        }
    }
}