import java.util.Random;

public class CrazyZombie extends Zombie{
    
    public CrazyZombie(GamePanel gamePanel){
        super(6,0, 0);
        super.setType('C');
        Random rnd = new Random();
        int y = rnd.nextInt(4);
        setOrigin(Constants.BOARD_WIDTH-50, (y*117) + 90);
        setGamePanel(gamePanel);
        setImageIcon(ImageFactory.createImage(Image.ROBOT_ZOMBIE));
    }
    
    public void update(){
        super.walk(15);
    }
}