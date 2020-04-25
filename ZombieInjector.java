import java.util.Random;

public class ZombieInjector implements Runnable {
    private Thread zombieThread;
    
    public ZombieInjector() {

    }

    public void run() {
        try {
            Random random = new Random();
            int i = 1;
            while (i <=15) {
                int type = random.nextInt(2);
                if (type == 1){
                    RobotZombie robotZombie = new RobotZombie();
                    GamePanel.elmtList.add(robotZombie);
                } else {
                    CrazyZombie crazyZombie = new CrazyZombie();
                    GamePanel.elmtList.add(crazyZombie);
                }
                zombieThread.sleep(10000);   
            }
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