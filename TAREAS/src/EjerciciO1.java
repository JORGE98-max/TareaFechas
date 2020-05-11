import java.util.Scanner;

public class EjerciciO1 {
	
	static int fecha1, fecha2, fechare;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese la primera fecha: ");
		fecha1 = scan.nextInt();
		
		
		if (fecha1 <= 30) {
			
			System.out.println("Ingrese la segunda fecha: ");
			fecha2 = scan.nextInt();
			
			fechare = fecha1 - fecha2;
			
			System.out.println("La diferencia de ambas fechas es : "+ fechare + " dias");
			
		}


	}

}
