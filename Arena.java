import java.util.List;

public class Arena{
    public static char[][] mat; 

    public Arena(){
        mat = new char[5][9];

        // matrix ver
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 9; j++){
                mat[i-1][j-1] = ' ';
            }
        }
        //
    }
	
	void checkArray() {
		BoardPoint p; char c;
        for (Element element : Game.elements){
            p = element.getOrigin();
            c = element.getType();
            // matrix ver
            if (c != '-' || (c == '-' && mat[p.getOrdinat()-1][p.getAbsis()] == ' ')) {
                mat[p.getOrdinat()-1][p.getAbsis()] = c;
            }    
        }
	}
	
	public boolean addElement(Element elmt) {
        checkArray();
    
        //matrix
        if (mat[elmt.getOrigin().getOrdinat()-1][elmt.getOrigin().getAbsis()] == ' ' || mat[elmt.getOrigin().getOrdinat()-1][elmt.getOrigin().getAbsis()] == '-'){
            mat[elmt.getOrigin().getOrdinat()-1][elmt.getOrigin().getAbsis()] = elmt.getType();
            return true;
        } else {
            return false;
        } 
        //
    }

	public  void deleteElement(BoardPoint p){
		checkArray();
        mat[p.getOrdinat()-1][p.getAbsis()] = ' ';
    }
	
    public  boolean moveElement(Element elmt, BoardPoint p){ 
	// bila elemen di p kosong, pindah elmt ke p dan return true. bila tidak, hanya return false.
        checkArray();
        // matrix ver
        if (mat[elmt.getOrigin().getOrdinat()-1][elmt.getOrigin().getAbsis()] == ' ') {
            mat[elmt.getOrigin().getOrdinat()-1][elmt.getOrigin().getAbsis()] = elmt.getType();
            deleteElement(elmt.getOrigin());
            return true;
        } else {
            return false;
        }
    }
	
    public void printArena(){
        checkArray();
        for (int i = 0; i < 5; i++){
            for (int j = 0 ; j < 9; j++){
                System.out.print(mat[i][j]);
            }
        }
    }

    public char getArray (int x, int y){
        return mat[y][x];
    }

    public char getArray (BoardPoint p){
        int x = p.getAbsis();
        int y = p.getOrdinat();
        return getArray(x, y);
    }
}
