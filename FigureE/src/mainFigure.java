import java.util.*;
import Figure.*;

public class mainFigure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Triangolo t = new Triangolo();
		TriangoloRettangolo tr = new TriangoloRettangolo();
		Rettangolo r = new Rettangolo();
		Quadrato q = new Quadrato();
		Cerchio c = new Cerchio();
		int scelta;
		
		
		do {
			System.out.println("Ciao, di quale forma geometrica vuoi calcolare l'area ed il perimetro?");
			System.out.println("1. Triangolo");
			System.out.println("2. Triangolo Rettangolo");
			System.out.println("3. Rettangolo");
			System.out.println("4. Quadrato");
			System.out.println("5. Cerchio");
			System.out.println("Scelta: ");
			scelta = input.nextInt();
			
			switch(scelta) {
			
			case 1:
				
				
			}
	}

}
}