
public class Poly {
	public int sum(int x, int y) { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) { 
        return (x + y); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p = new Poly(); 
        System.out.println(p.sum(10, 20)); 
        System.out.println(p.sum(10, 20, 30)); 
        System.out.println(p.sum(10.5, 20.5));

	}

}
