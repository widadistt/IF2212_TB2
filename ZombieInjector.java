import java.util.Random;

public class ZombieInjector implements Runnable {
    private GamePanel gamePanel;
    private Thread zombieThread;
    
    public ZombieInjector(GamePanel gp) {
        this.gamePanel = gp;
    }

    public void run() {
        try {
            Random random = new Random();
            int type = random.nextInt(2);
            if (type == 1){
                RobotZombie robotZombie = new RobotZombie(gamePanel);
                GamePanel.elmtList.add(robotZombie);
            } else {
                CrazyZombie crazyZombie = new CrazyZombie(gamePanel);
                GamePanel.elmtList.add(crazyZombie);
            }
            zombieThread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception in Zombie Injector");
        }
    }

    public void start () {
        //if (sunfThread == null) {
           zombieThread = new Thread(this);
           zombieThread.start();
        //}
     }
}