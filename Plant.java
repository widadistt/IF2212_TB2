// model 

import java.util.List;

public abstract class Plant extends Element{
    private int life;
    private int price;
    
	public static boolean isPlant(Element e) {
		return e.getType() == 'P' || e.getType() == 'S';
	}
	
	public static boolean containsPlant(List<Element> e) {
        for (Element element : e){
            if (isPlant(element)) {
                return true;
            }
        }
		return false;		
	}
	
    public Plant(int life, int price, int x,int y){
        super(x,y);
        this.life = life;
        this.price = price;
    }

    public Plant(int life, int price, Point p){
        super(p);
        this.life = life;
        this.price = price;
    }

    public int getLife(){
        return life;
    }

    public int getPrice(){
        return price;
    }
    
    public void setLife(int life){
        this.life = life;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    protected void shoot(int power){
        Bullet bullet = new Bullet(power,super.getOrigin().getAbsis()+1, super.getOrigin().getOrdinat());
        Game.addElement(bullet, false);
    }

    public void eaten(int power){
        if (life >= power){
            setLife(getLife()-power);
        } else {
            setLife(0);
        }
        if (life == 0){
            Game.deleteElement(this);
        }
    }  
}
