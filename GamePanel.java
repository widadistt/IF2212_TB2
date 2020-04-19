// ui package

import javax.swing.ImageIcon;
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
    //public static List<Sunflower> sunList;

    public GamePanel(JLabel sunflowerBoard) {
        initializeVariables();
        initializeLayout();
        this.sunflowerBoard = sunflowerBoard;
    }

    private void initializeVariables() {
        this.backgroundImage = ImageFactory.createImage(Image.BACKGROUND);
        sunflowerPoints = 5000;
        timer =  new Timer(Constants.GAME_SPEED, new GameLoop(this));
        this.timer.start();
        sunflowerInjector = new SunflowerInjector(this);
        sunflowerInjector.start();
		elmtList = new ArrayList<Element>();
		inGame = true;
        elmtList.add(new RobotZombie(1,1));
        //sunList.add(new Sunflower(this));
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
        sunflowerPoints = sunflowerPoint;
        sunflowerBoard.setText(String.valueOf(getSunflowerPoints()));
    }

    public void addSunflowerPoints (int sunflowerPoint) {
        setSunflowerPoints(getSunflowerPoints() + sunflowerPoint);
        //sunflowerBoard.setText(String.valueOf(getSunflowerPoints()));
    }

    private void drawElement(Graphics g) {
        if (inGame){
            List<Element> cElements = new ArrayList<Element>(GamePanel.elmtList);
            for (Element elmt: cElements){
                if (elmt.getOrigin().getAbsis() <= 100) {
                    System.out.println(elmt.getType());
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
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(ImageFactory.createImage(Image.BACKGROUND).getImage(), 0, 0, Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT, null);

        //drawElement(g);
        List<Element> cElements = new ArrayList<Element>(GamePanel.elmtList);
        for (Element elmt: cElements){
            if (elmt.getOrigin().getAbsis() <= 1000) {
                System.out.println(elmt.getType());
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
                        //g.drawImage(ImageFactory.createImage(Image.SUNFLOWER).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                        g.drawImage(ImageFactory.createImage(Image.SUNFLOWER).getImage(), elmt.getOrigin().getAbsis(), elmt.getOrigin().getOrdinat(), 50, 50, null);
                        break;

                    case '-':
                        g.drawImage(ImageFactory.createImage(Image.PEASHOOTER_BULLET).getImage(), elmt.getOrigin().getAbsis() + 280, (elmt.getOrigin().getOrdinat() * 117) + 90, 60, 100, null);
                        break;
                        
                    default:
                        break;
                }
            }
        }
        Toolkit.getDefaultToolkit().sync();
        System.out.println("REPAINT");
    }

    public void doOneLoop() {
        this.update();
        repaint();
    }

    public void update() {
        // plant shot, move zombie;
        //this.Plant.move();
        System.out.println("UPDATE");
        List<Element> cElements = new ArrayList<Element>(elmtList);
        if (cElements.size() > 0) {
            for (Element elmt: cElements){
                elmt.update();
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        //this.Plant.keyReleased(e);
        System.out.println("PRESSED");
    }

    public void keyPressed(KeyEvent e) {
        /*
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
        */
    }
}