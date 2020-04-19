

public class SunflowerInjector implements Runnable {
    private GamePanel gamePanel;
    private Thread sunfThread;
    
    public SunflowerInjector(GamePanel gp) {
        this.gamePanel = gp;
    }

    public void run() {
        try {
            Sunflower sf  = new Sunflower(this.gamePanel);
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception in Sunflower Injector");
        }
    }

    public void start () {
        if (sunfThread == null) {
           sunfThread = new Thread(this);
           sunfThread.start ();
        }
     }
}