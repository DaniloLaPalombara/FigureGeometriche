package Figure;

public class Cerchio extends figureGeneriche {
	
	protected double raggio;
	static double p = 3.14;
	
	public Cerchio (String nome, double raggio ) {
		
		super(nome);
		this.raggio = raggio;
	}
	
	public double getPerimetro (double raggio, double p) {
    	return perimetro = (raggio*2)*p;
	}
	
	public void stampaPerimetro () {
		System.out.println("La circonferenza del cerchio è "+ perimetro);
	}
	
	public double getArea (double raggio, double p) {
		return area = (raggio*raggio)*p;
	}
	
	public void stampaArea () {
		System.out.println("L'area del cerchio è "+ area);
	}
}
