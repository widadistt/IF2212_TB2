public class Bullet extends Element{
    private int power;
    
    public Bullet(int power, Point p){
        super(p);
        this.power = power;
        super.setType('-');
    }
    
    public Bullet(int power, int x, int y){
        super(x,y);
        this.power = power;
        super.setType('-');
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }
    public void update() {
		fly(2);
	}
    public void fly(int distance){
        Point p = super.getOrigin();
        while (distance > 0) {
			p.translate(1, 0);
			distance--;
			if (p.getAbsis() >= 60) {
				distance = 0;
				Game.deleteElement(this);
				break;
			}
			if (!Game.moveElement(this, p, true)) {
				if (Zombie.containsZombie(Game.getElements(p))) { //
					distance = 0;
					for (Element e : Game.getElements(p)) {
						if (Zombie.isZombie(e)) {
							((Zombie)e).shot(power);
						}
					}
					Game.deleteElement(this);
				} else {
					Game.moveElement(this, p, false);
					super.setOrigin(p);					
				}
			} else {
				super.setOrigin(p);
			}
		}
    }

    public void kill(Zombie z) {
		z.shot(power);
		Game.deleteElement(this);
	}
}