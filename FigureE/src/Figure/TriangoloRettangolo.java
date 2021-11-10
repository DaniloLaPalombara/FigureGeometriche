package Figure;

public class TriangoloRettangolo extends Triangolo {
	
	public TriangoloRettangolo (String nome, double base, double altezza, double lato2, double lato3) {
		
		super(nome, base, altezza, lato2, lato3);
	}
	
    public double getPerimetro (int base, int lato2, int lato3) {
    	return perimetro = base+lato2+lato3;
	}
	
	public void stampaPerimetro () {
		System.out.println("Il perimetro del triangolo rettangolo è "+ perimetro);
	}
	
	public double getArea () {
		return area = (base*altezza)/2;
	}
	
	public void stampaArea () {
		System.out.println("L'area del triangolo rettangolo è "+ area);
	}
}
