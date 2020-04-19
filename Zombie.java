import java.util.List;

public abstract class Zombie extends Element{
    private int life;

	public static boolean isZombie(Element e) {
		return e.getType() == 'R' || e.getType() == 'C';
	}
	
	public static boolean containsZombie(List<Element> e) {
        for (Element element : e){
            if (isZombie(element)) {
				return true;
			}
        }
		return false;		
	}
	
    public Zombie(int life, int x, int y){
        super(x,y);
        this.life = life;
    }

    public Zombie(int life, BoardPoint p){
        super(p);
        this.life = life;
    }

    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life = life;
    }
	public void update() {
		//System.out.println("zombie");
		if (getType() =='R'){
            walk(4);
        } else {
            walk(2);
        }
	}
	
    protected void walk(int distance){
        BoardPoint p = super.getOrigin();
        while (distance > 0) {
			p.translate(-1, 0);
			distance--;
			if (!Game.moveElement(this, p, true)) {
				for (Element e : Game.getElements(p)) {
					if (e.getType() == 'P' || e.getType() == 'S') {
						((Plant)e).eaten(1);
					} else if (e.getType() == 'R' || e.getType() == 'C'){
						Game.moveElement(this, p, false);
						super.setOrigin(p);					
						for (Element element : Game.getElements(p)) {
							if (element.getType() == '-') {
							((Bullet)element).kill(this);
							}
						}
					}
				}
			} else {
				super.setOrigin(p);
			}
			if (p.getAbsis() <= 1) {
				distance = 0;
			}
		}
    }
        
    public void shot(int power){
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