
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class Element{
    private Point origin;
    private ImageIcon elmtIcon;
    private boolean dead;
    private char type;
    private JPanel elmtPanel;

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

    public void setImageIcon (ImageIcon imageIcon) {
        this.elmtIcon =  imageIcon;
    }

    public ImageIcon getImageIcon() {
        return elmtIcon;
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