public class SnowPea extends Plant{
    
    public SnowPea(int x, int y){
        super(5,600,x,y);
        super.setShow('S');
        Game.sunflowerPoints-=600;
    }
    
    public void update(){
        super.shoot(3);
    }

}