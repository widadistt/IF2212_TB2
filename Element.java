import java.awt.Image;

public abstract class Element{
    private Point origin;
    private Image image;
    private boolean dead;
    private char type;

    public Element(Point origin){
        this.origin = origin;
        this.dead = false;
        //this.image = 
    }

    public Element(int x, int y){
        Point point = new Point(x,y);
        this.origin = point;
        this.dead = false;
    }
    
    public Point getOrigin(){
		Point o = new Point(0,0);
		o.setAbsis(origin.getAbsis());
		o.setOrdinat(origin.getOrdinat());
        return o;
    }

    public void setOrigin(int x, int y){
        origin = new Point(x,y);
    }

    public void setOrigin(Point point){
        origin.setAbsis(point.getAbsis());
        origin.setOrdinat(point.getOrdinat());
    }

    public void setImage (Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isDead() {
        return dead;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

	public abstract void update();

    public void die() {
        this.dead = true;
    }
}