// Image

import javax.swing.ImageIcon;
//import sun.awt.www.content.audio.basic;

public class ImageFactory {
    public static ImageIcon createImage(Image image){
        ImageIcon imageIcon = null;
        switch (image){
        case BACKGROUND:
            imageIcon = new ImageIcon(Constants.BACKGROUND_URL);
            break;

        case OPENING:
            imageIcon = new ImageIcon(Constants.OPENING_URL);
            break;

        case PEASHOOTER:
            imageIcon = new ImageIcon(Constants.PEASHOOTER_URL);
            break;

        case SNOWPEA:
            imageIcon =  new ImageIcon(Constants.SNOWPEA_URL);
            break;

        case ROBOT_ZOMBIE:
            imageIcon = new ImageIcon(Constants.ROBOT_ZOMBIE_URL);
            break;

        case CRAZY_ZOMBIE:
            imageIcon = new ImageIcon(Constants.CRAZY_ZOMBIE_URL);
            break;
        
        case SUNFLOWER:
            imageIcon = new ImageIcon(Constants.SUNFLOWER_URL);
            break;

        case PEASHOOTER_BULLET:
            imageIcon = new ImageIcon(Constants.PEASHOOTER_BULLET_URL);
            break;

        case SNOWPEA_BULLET:
            imageIcon = new ImageIcon(Constants.SNOWPEA_BULLET_URL);
            break;

        case ICON:
            imageIcon = new ImageIcon(Constants.ICON);
            break;
        
        default:
            break;
        }

        return imageIcon;
    }
}