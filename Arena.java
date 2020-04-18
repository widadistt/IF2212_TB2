import java.util.List;

public class Arena{
    public static char[][] mat; 
    public char[] row1; 
    public char[] row2; 
    public char[] row3; 
    public char[] row4; 
    public char[] row5; 

    public Arena(){
        mat = new char[5][9];
        this.row1 = new char[9];
        this.row2 = new char[9];
        this.row3 = new char[9];
        this.row4 = new char[9];
        this.row5 = new char[9];

        // matrix ver
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 9; j++){
                mat[i-1][j-1] = ' ';
            }
        }
        //

//        row1[0] = '*';
//        row1[59] = '*'; 
        for (int i= 1; i <= 9; i++ ){
            row1[i-1] = ' ';            
        
//        row2[0] = '*';
//        row2[59] = '*'; 
        for (int i= 1; i <= 9; i++ ){
            row2[i-1] = ' ';            
        }
//        row3[0] = '*';
//        row3[59] = '*'; 
        for (int i= 1; i <= 9; i++ ){
            row3[i-1] = ' ';            
        }
//        row4[0] = '*';
//        row4[59] = '*'; 
        for (int i= 1; i <= 9; i++ ){
            row4[i-1] = ' ';   
        }    
        for (int i= 1; i <= 9; i++ ){
            row5[i-1] = ' ';               
        }
    }
	
	void checkArray() {
        row1[0] = '*';
        row1[59] = '*'; 
        row2[0] = '*';
        row2[59] = '*'; 
        row3[0] = '*';
        row3[59] = '*'; 
        row4[0] = '*';
        row4[59] = '*'; 
        for (int i= 1; i <= 9; i++ ){
            row1[i] = ' ';            
            row2[i] = ' ';           
            row3[i] = ' ';         
            row4[i] = ' ';              
        }
		Point p; char c;
        for (Element element : Game.elements){
            p = element.getOrigin();
            c = element.getType();
            // matrix ver
            if (c != '-' || (c == '-' && mat[p.getOrdinat()-1][p.getAbsis()] == ' ')) {
                mat[p.getOrdinat()-1][p.getAbsis()] = c;
            }    
            //
			if (p.getOrdinat() == 1) {
				if (c != '-' || (c == '-' && row1[p.getAbsis()] == ' ')) {
					row1[p.getAbsis()] = c;
				}
			} else if (p.getOrdinat() == 2) {
				if (c != '-' || (c == '-' && row2[p.getAbsis()] == ' ')) {
					row2[p.getAbsis()] = c;
				}				
			} else if (p.getOrdinat() == 3) {
				if (c != '-' || (c == '-' && row3[p.getAbsis()] == ' ')) {
					row3[p.getAbsis()] = c;
				}				
			} else if (p.getOrdinat() == 4) {
				if (c != '-' || (c == '-' && row4[p.getAbsis()] == ' ')) {
					row4[p.getAbsis()] = c;
				}				
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
        if (elmt.getOrigin().getOrdinat() == 1){
            if (row1[elmt.getOrigin().getAbsis()] == ' ' || row1[elmt.getOrigin().getAbsis()] == '-'){
                row1[elmt.getOrigin().getAbsis()] = elmt.getType();
				return true;
            } else {
				return false;
            }
        } else if (elmt.getOrigin().getOrdinat() == 2){
            if (row2[elmt.getOrigin().getAbsis()] == ' ' || row2[elmt.getOrigin().getAbsis()] == '-'){
                row2[elmt.getOrigin().getAbsis()] = elmt.getType();  
				return true; 
            } else {
				return false;
            }
        } else if (elmt.getOrigin().getOrdinat() == 3){
            if (row3[elmt.getOrigin().getAbsis()] == ' ' || row3[elmt.getOrigin().getAbsis()] == '-'){
                row3[elmt.getOrigin().getAbsis()] = elmt.getType();  
				return true; 
            } else {
				return false;
            }
        } else if (elmt.getOrigin().getOrdinat() == 4){
            if (row4[elmt.getOrigin().getAbsis()] == ' ' || row4[elmt.getOrigin().getAbsis()] == '-'){
                row4[elmt.getOrigin().getAbsis()] = elmt.getType();  
				return true; 
            } else {
				return false;
            }
        } else {
            System.out.println("Masukan ordinat tidak valid");
			return false;
        }
    }

	public  void deleteElement(Point p){
		checkArray();
        if (p.getOrdinat() == 1){
            row1[p.getAbsis()] = ' ';
        } else if (p.getOrdinat() == 2){
            row2[p.getAbsis()] = ' ';
        } else if (p.getOrdinat() == 3){
            row3[p.getAbsis()] = ' ';
        } else if (p.getOrdinat() == 4){
            row4[p.getAbsis()] = ' ';
        }

        mat[elmt.getOrigin().getOrdinat()-1][elmt.getOrigin().getAbsis()] = ' ';
    }
	
    public  boolean moveElement(Element elmt, Point p){ 
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
        
        if (p.getOrdinat() == 1){
			if (row1[p.getAbsis()] == ' ') {
				row1[p.getAbsis()] = elmt.getType();
				deleteElement(elmt.getOrigin());
				return true;
			} else {
				return false;
			}
        } else if (p.getOrdinat() == 2){
			if (row2[p.getAbsis()] == ' ') {
				row2[p.getAbsis()] = elmt.getType();
				deleteElement(elmt.getOrigin());
				return true;
			} else {
				return false;
			}
        } else if (p.getOrdinat() == 3){
			if (row3[p.getAbsis()] == ' ') {
				row3[p.getAbsis()] = elmt.getType();
				deleteElement(elmt.getOrigin());
				return true;
			} else {
				return false;
			}
        } else if (p.getOrdinat() == 4){
			if (row4[p.getAbsis()] == ' ') {
				row4[p.getAbsis()] = elmt.getType();
				deleteElement(elmt.getOrigin());
				return true;
			} else {
				return false;
			}
        } else {
            System.out.println("Titik tidak valid");
			return false;
        }
    }
	
    public void printArena(){
        checkArray();
        
        for (int i = 0; i <5; i++){
            
        }
        //line 1
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 1
        for (int i= 0; i < 60; i++ ){
            System.out.print(row1[i]);            
        }
        System.out.print('\n');
        //line 2
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 2
        for (int i= 0; i < 60; i++ ){
            System.out.print(row2[i]);            
        }
        System.out.print('\n');
        //line 3
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 3
        for (int i= 0; i < 60; i++ ){
            System.out.print(row3[i]);            
        }
        System.out.print('\n');
        //line 4
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 4
        for (int i= 0; i < 60; i++ ){
            System.out.print(row4[i]);            
        }
        System.out.print('\n');
        //line 5
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
    }

    public char getArray (int x, int y){
        char[] arr = new char[60];
        if (x == 1){
            arr = row1;
        } else if (x == 2){
            arr = row2;
        } else if (x == 3){
            arr = row3;
        } else if (x == 4){
            arr = row4;
        } else {} 
        return arr[y-1];
    }

    public char getArray (Point p){
        int x = p.getAbsis();
        int y = p.getOrdinat();
        return getArray(x, y);
    }
}
