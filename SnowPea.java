public class SnowPea extends Plant{
    
    public SnowPea(int x, int y){
        super(5,600,x,y);
        super.setType('S');
        Game.sunflowerPoints-=600;
    }
    
    public void update(){
        //System.out.println("snowpea");
        super.shoot(3);
    }

}