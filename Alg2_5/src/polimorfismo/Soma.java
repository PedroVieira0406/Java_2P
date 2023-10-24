package polimorfismo;

public class Soma {
	
	public static void main(String[] args) {
		Soma s = new Soma();
		System.out.println(s.somar(10.0, 5));
		
		
	}

	public int somar(int v1, int  v2) {
		return v1+v2;
	}
	public int somar(double v1, double  v2) {
		return (int)(v1+v2);
	}
	public int somar(int v1, double  v2) {
		return v1+ (int) v2;
	}
	public int somar(double v1, int  v2) {
		return (int)v1+v2;
	}
	
}
