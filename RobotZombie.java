public class RobotZombie extends Zombie{
    
    public RobotZombie(int x, int y){
        super(10,x,y);
        super.setType('R');
    }
    
    public void update(){
        super.walk(4);
    }
}
