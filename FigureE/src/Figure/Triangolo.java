package Figure;

public class Triangolo extends figureGeneriche {
	
	protected double base;
	protected double altezza;
	protected double lato1;
	protected double lato2;
	protected double lato3;
	
	public Triangolo (String nome, double base, double altezza, double lato2, double lato3) {
		
		super(nome);
		this.base = base;
		this.altezza = altezza;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	
	public double getPerimetro (int base, int lato2, int lato3) {
		return perimetro = base+lato2+lato3;
	}
	
	public void stampaPerimetro () {
		System.out.println("Il perimetro del triangolo è "+ perimetro);
	}
	
	public double getArea () {
		return area = (base*altezza)/2;
	}
	
	public void stampaArea () {
		System.out.println("L'area del triangolo è "+ area);
	}

}
