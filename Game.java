import java.util.Random;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;  
import javax.swing.*; 

public class Game{
    public static Arena arena;
    public static int sunflowerPoints;
    public static List<Element> elements;
    public static boolean end;
    public static Point p; //untuk addPlants
    public static String type; //untuk addPlants

    public int getSunflowerPoints(){
        return sunflowerPoints;
    }

    public void setSunflowerPoints(int score){
        sunflowerPoints = score;
    }

    public Game(){
        Game.arena = new Arena();
        sunflowerPoints = 5000;
        elements = new ArrayList<Element>();
        end = false;
        Game.start();
//        Game.arena.printArena();       
    }

    public static void skip(){
        if (!end){
            if ((Arena.mat[1][0] == 'C') || (Arena.mat[1][0] == 'R') || (Arena.mat[2][0] == 'C') || (Arena.mat[2][0] == 'R') || (Arena.mat[3][0] == 'C') || (Arena.mat[3][0] == 'R') || (Arena.mat[0][0] == 'C') || (Arena.mat[0][0] == 'R')){ // cek ada zombie diujung ato ngga
                end = true;
            } else {
                List<Element> cElements = new ArrayList<Element>(elements);
                for (Element element : cElements){
                    element.update();
                }
                addZombies();
            }
        }
		//sunflowerPoints += 50;
    }

    public static void addElement(Element elmt, boolean mustNotOverlap){
        
        if (mustNotOverlap) {
			if (arena.addElement(elmt)) {
                elements.add(elmt);
                GamePanel.elmtList = elements; //Penyamaan Game dan GamePanel
			}
		} else {
			elements.add(elmt);
			arena.addElement(elmt);
		}
    }

    public static void deleteElement(Element elmt){
		if (elements.contains(elmt)) {
			arena.deleteElement(elmt.getOrigin());
			elements.remove(elmt);
			if (elmt.getType() == 'R' || elmt.getType() == 'C') {
			} 
		}
    }
	
    public static boolean moveElement(Element elmt, BoardPoint p, boolean mustNotOverlap) { 
    // bila elemen di p kosong, pindah elmt ke p dan return true. bila tidak, hanya return false.
        boolean move = false;
        if (mustNotOverlap) {
			for (Element element : GamePanel.elmtList) {
                if (element.getOrigin().getAbsis() == p.getAbsis()){
                    if (element.getOrigin().getOrdinat() == p.getOrdinat()){
                        move = false;
                    }
                }
            }
		} else {
			move = true;
        }
        return move;
    }
	
	public static List<Element> getElements(BoardPoint p) {
        List<Element> cElements = new ArrayList<Element>();
        for (Element element : GamePanel.elmtList){
            if(element.getOrigin().equals(p)) {
				cElements.add(element);
			}
        }
        return cElements;	
        
        //(element.getOrigin().getAbsis() == p.getAbsis()) && (element.getOrigin().getOrdinat() == p.getOrdinat())
	}
    
    public static void addPlants(BoardPoint p, String type){
    try {    
        int x = (int) p.getAbsis();
        int y = (int) p.getOrdinat();
        Game.addPlants(x, y, type);
    } catch (IsFilledException | SunflowerpointsNotEnoughException a){
        JFrame f = new JFrame();
        String message = "["+a.getClass().getName()+"] " + a.getMessage();
        JOptionPane.showMessageDialog(f, message); 
    }
    }
    public static void addPlants(int x, int y, String type) throws IsFilledException, SunflowerpointsNotEnoughException {
        Plant plant;
        if (type.equals("P") || (type.equals("p"))){
			if (sunflowerPoints >= 350) {
				plant = new PeaShooter(x, y);
				addElement(plant, true);
				if (!elements.contains(plant)) {
					sunflowerPoints += 350;
                    System.out.println("Sudah terisi");
                    throw new IsFilledException();
				}
			} else {
                System.out.println("Sunflower Points tidak mencukupi!");
                throw new SunflowerpointsNotEnoughException();    
            }
        } else if (type.equals("S") || (type.equals("s"))){
			if (sunflowerPoints >= 600) {
				plant = new SnowPea(x,y);
				addElement(plant, true);
				if (!elements.contains(plant)) {
					sunflowerPoints += 600;
                    System.out.println("Sudah terisi");
                    throw new IsFilledException();
				}
			} else {
                System.out.println("Sunflower Points tidak mencukupi!");
                throw new SunflowerpointsNotEnoughException(); 				
			}
        } else {
            System.out.println("Input tipe salah");
        }
    }

    public static void addZombies(){
        Random random = new Random();
        int randomNumb = random.nextInt(5);
        int randomZombie = random.nextInt(2);
        Zombie zombie;
        if (randomZombie == 0){
            zombie = new CrazyZombie(8, randomNumb+1);
        } else {
            zombie = new RobotZombie(8, randomNumb+1);
        }
        addElement(zombie, true);      
    }

    public static void printCommand(){
        System.out.println("COMMAND :");
        System.out.println("SKIP");
        System.out.println("ADDPLANT <row> <distance> <type>");
        System.out.println("row : 1 - 5 from top to bottom");
        System.out.println("distance : 1 - 9 from left to right");
        System.out.println("Type : P for PeaShooter ; S for SnowPea");
    }

    public static void start(){
        System.out.println("START THE GAME!");
    }

    public static void gameOver(boolean end) throws LoseException{
        if (end){
            System.out.println("GAME OVER");
            System.out.println("Points = " + Game.sunflowerPoints);
            throw new LoseException();
        }
    }
}