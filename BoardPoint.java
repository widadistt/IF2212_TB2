public class BoardPoint {
    private int x, y; // absis dan ordinat

    // Constructor
    // Set titik mula-mula ke (0, 0)
    public BoardPoint() {
      this.x = 0;
      this.y = 0;
    }

    // Set titik mula-mula ke (x, y)
    public BoardPoint(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getAbsis() {
      return x;
    }

    public int getOrdinat() {
      return y;
    }

    public void setAbsis(int x) {
      this.x = x;
    }

    public void setOrdinat(int y) {
      this.y = y;
    }

    // Mengubah titik dengan penambahan BoardPoint argumen
    public void translate(BoardPoint p) {
      this.x += p.x;
      this.y += p.y;
    }

    // Mentranslasikan titik sebesar (x, y)
    public void translate(int x, int y) {
      this.x += x;
      this.y += y;
    }

    // Menghasilkan jarak antara titik sekarang dengan BoardPoint argumen
    public double distance(BoardPoint p) {
      return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
	
	// Menghasilkan true jika posisi sama dengan BoardPoint argumen
	public boolean equals(BoardPoint p) {
		return this.x == p.x && this.y == p.y;
	}
	
    // Menuliskan titik ke layar dengan format "(x,y)"
    public void print() {
      System.out.println("(" + this.x + "," + this.y + ")");
    }
}