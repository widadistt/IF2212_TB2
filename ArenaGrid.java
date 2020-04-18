import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;  

public class ArenaGrid extends JButton{
    protected Point origin;
   
    public ArenaGrid(int x, int y){
        origin = new Point(x,y);
        this.setActionCommand("changePoint");
    }

    public Point getOrigin(){
        return origin;
    } 

    // public void actionPerformed(ActionEvent ae){
    //     String action = ae.getActionCommand();
    //     if (action.equals("changePoint")){
    //         Game.p = origin;
    //     }
    //     Game.addPlants(Game.p, Game.type);
   // }
}