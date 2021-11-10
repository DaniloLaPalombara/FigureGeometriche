package Figure;

public class Quadrato extends Rettangolo {
	
	protected double lato;
	
	public Quadrato (String nome, double lato) {
		
		super(nome);
		this.lato = lato;
	}
	
	public double getPerimetro (double lato) {
    	return perimetro = lato*4;
	}
	
	public void stampaPerimetro () {
		System.out.println("Il perimetro del quadrato è "+ perimetro);
	}
	
	public double getArea (double lato) {
		return area = lato*lato;
	}
	
	public void stampaArea () {
		System.out.println("L'area del quadrato è "+ area);
	}
	
	public String getNome (String nome) {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
}
