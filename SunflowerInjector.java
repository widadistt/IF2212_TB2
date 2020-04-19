

public class SunflowerInjector implements Runnable {
    private GamePanel gamePanel;
    private Thread sunfThread;
    
    public SunflowerInjector(GamePanel gp) {
        this.gamePanel = gp;
    }

    public void run() {
        try {
            Sunflower sf  = new Sunflower(gamePanel);
            GamePanel.elmtList.add(sf);
            //gamePanel.add(sf);
            sunfThread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception in Sunflower Injector");
        }
    }

    public void start () {
        //if (sunfThread == null) {
           sunfThread = new Thread(this);
           sunfThread.start();
        //}
     }
}