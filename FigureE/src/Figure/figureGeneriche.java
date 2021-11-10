package Figure;

public class figureGeneriche {
	
	protected double perimetro;
	protected double area;
	protected String nome;
	
	public figureGeneriche(String nome) {
		
		this.nome = nome;
	}

	
	public void stampaPerimetro() {
		perimetro = 0;
	}
	
	public void stampaArea() {
		area = 0;
	}
	
	public double getPerimetro (double perimetro) {
		return perimetro;
	}
	
	public void setPerimetro (double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getArea (double area) {
		return area;
	}
	
	public void setArea (double area) {
		this.area = area;
	}
	
	
	
	
}
