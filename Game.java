import java.util.Random;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

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
    }

    public static void skip(){
        if (!end){
            if ((arena.row1[1] == 'C') || (arena.row1[1] == 'R') || (arena.row2[1] == 'C') || (arena.row2[1] == 'R') || (arena.row3[1] == 'C') || (arena.row3[1] == 'R') || (arena.row4[1] == 'C') || (arena.row4[1] == 'R')){ // cek ada zombie diujung ato ngga
                end = true;
            } else {
                List<Element> cElements = new ArrayList<Element>(elements);
                for (Element element : cElements){
                    element.update();
                }
                addZombies();
            }
        }
		sunflowerPoints += 50;
    }

    public static void addElement(Element elmt, boolean mustNotOverlap){
		if (mustNotOverlap) {
			if (arena.addElement(elmt)) {
				elements.add(elmt);
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
		if (mustNotOverlap) {
			return arena.moveElement(elmt, p);
		} else {
			arena.moveElement(elmt, p);
			return true;
		}
    }
	
	public static List<Element> getElements(BoardPoint p) {
        List<Element> cElements = new ArrayList<Element>();
        for (Element element : elements){
            if(element.getOrigin().equals(p)) {
				cElements.add(element);
			}
        }
		return cElements;		
	}
    
    public static void addPlants(Point p, String type){
        int x = (int) p.getX();
        int y = (int) p.getY();
        Game.addPlants(x, y, type);
    }
    public static void addPlants(int x, int y, String type){
        Plant plant;
        if (type.equals("P") || (type.equals("p"))){
			if (sunflowerPoints >= 350) {
				plant = new PeaShooter(x, y);
				addElement(plant, true);
				if (!elements.contains(plant)) {
					sunflowerPoints += 350;
					System.out.println("Sudah terisi");
				}
			} else {
				System.out.println("Sunflower Points tidak mencukupi!");
			}
        } else if (type.equals("S") || (type.equals("s"))){
			if (sunflowerPoints >= 600) {
				plant = new SnowPea(x,y);
				addElement(plant, true);
				if (!elements.contains(plant)) {
					sunflowerPoints += 600;
					System.out.println("Sudah terisi");
				}
			} else {
				System.out.println("Sunflower Points tidak mencukupi!");				
			}
        } else {
            System.out.println("Input tipe salah");
        }
    }

    public static void addZombies(){
        Random random = new Random();
        int randomNumb = random.nextInt(4);
        int randomZombie = random.nextInt(2);
        Zombie zombie;
        if (randomZombie == 0){
            zombie = new CrazyZombie(58, randomNumb+1);
        } else {
            zombie = new RobotZombie(58, randomNumb+1);
        }
        addElement(zombie, true);      
    }

    public static void printCommand(){
        System.out.println("COMMAND :");
        System.out.println("SKIP");
        System.out.println("ADDPLANT <row> <distance> <type>");
        System.out.println("row : 1 - 4 from top to bottom");
        System.out.println("distance : 1 - 58 from left to right");
        System.out.println("Type : P for PeaShooter ; S for SnowPea");
    }
}