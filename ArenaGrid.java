import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;  

public class ArenaGrid extends JButton{
    protected BoardPoint origin;
   
    public ArenaGrid(int x, int y){
        origin = new BoardPoint(x,y);
        this.setActionCommand("changePoint");
    }


    public BoardPoint getOrigin(){
        return origin;
    } 
}