import javax.swing.ImageIcon;

public class Bullet extends Element{
	private int power;
    
    public Bullet(int power, Point p){
        super(p);
        this.power = power;
		super.setType('-');
		initialize();
    }
    
    public Bullet(int power, int x, int y){
        super(x,y);
        this.power = power;
		super.setType('-');
		initialize();
	}
	
	public void initialize() {
		ImageIcon imageIcon =  ImageFactory.createImage(Image.PEASHOOTER_BULLET);
		setImage(imageIcon.getImage());


	}

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
	}
	
    public void update() {
		move();
	}
/*
	public void move() {
		
	}
*/
    public void move(){
		int distance = Constants.BULLET_SPEED;
        Point p = super.getOrigin();
        while (distance > 0) {
			p.translate(1, 0);
			distance--;
			if (p.getAbsis() >= Constants.BOARD_WIDTH) {
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