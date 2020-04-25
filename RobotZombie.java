import java.util.Random;

public class RobotZombie extends Zombie{
    
    public RobotZombie(){
        super(10,0,0);
        super.setType('R');
        Random rnd = new Random();
        int y = rnd.nextInt(4);
        setOrigin(Constants.BOARD_WIDTH -50, (y*117) + 90);
        setImageIcon(ImageFactory.createImage(Image.ROBOT_ZOMBIE));
    }
    
    public void update(){
        super.walk(1);
    }
}