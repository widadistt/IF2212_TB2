import javax.swing.ImageIcon;

public class PeaShooter extends Plant{
    
    public PeaShooter(int x,int y){
        super(3,350, x,y);
        initialize();
        Game.sunflowerPoints-=350;
    }

    private void initialize() {
        ImageIcon imageIcon = ImageFactory.createImage(Image.PEASHOOTER);
        setImageIcon(imageIcon);
    }

    public void update(){
        //System.out.println("peashooter");
        super.shoot(1);
    }

}