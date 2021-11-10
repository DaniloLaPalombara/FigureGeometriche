package Figure;

public class Rettangolo extends figureGeneriche{
	
	protected double lato1;
	protected double lato2;
	
	public Rettangolo (String nome, double lato1, double lato2) {
		
		super(nome);
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	 public double getPerimetro (double lato1, double lato2) {
	    	return perimetro = (lato1*2)+(lato2*2);
		}
		
		public void stampaPerimetro () {
			System.out.println("Il perimetro del rettangolo è "+ perimetro);
		}
		
		public double getArea (double lato1, double lato2) {
			return area = lato1*lato2;
		}
		
		public void stampaArea () {
			System.out.println("L'area del rettangolo è "+ area);
		}

}
