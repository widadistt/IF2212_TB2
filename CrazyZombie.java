public class CrazyZombie extends Zombie{
    
    public CrazyZombie(int x, int y){
        super(6,x,y);
        super.setType('C');
    }
    
    public void update(){
        super.walk(2);
    }
}