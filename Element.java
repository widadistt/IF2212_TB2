
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class Element{
    private ImageIcon elmtIcon;
    private BoardPoint origin;
    private boolean dead;
    private char type;

    public Element(BoardPoint origin){
        this.origin = origin;
        this.dead = false;
        //this.image = 
    }


    public Element(int x, int y){
        BoardPoint point = new BoardPoint(x,y);
        this.origin = point;
        this.dead = false;
    }
    
    public BoardPoint getOrigin(){
		BoardPoint o = new BoardPoint(0,0);
		o.setAbsis(origin.getAbsis());
		o.setOrdinat(origin.getOrdinat());
        return o;
    }

    public void setOrigin(int x, int y){
        origin = new BoardPoint(x,y);
    }

    public void setOrigin(BoardPoint boardPoint){
        origin.setAbsis(boardPoint.getAbsis());
        origin.setOrdinat(boardPoint.getOrdinat());
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