public class ArenaGrid extends JButton{
    protected Point origin;

    public ArenaGrid(int x, int y){
        p = new Point(x,y);
    }

    public Point getOrigin(){
        return origin;
    } 
}