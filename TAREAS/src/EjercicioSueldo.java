import java.util.Scanner;

public class EjercicioSueldo {

	static int sueldo;

	public static void main(String[] args) {

		double suefin;

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese su sueldo: ");
		sueldo = scan.nextInt();

		if (sueldo < 1000) {

			suefin = sueldo * 1.15;

			System.out.println("Usted recibe " + suefin + " en total");
		} else {
			System.out.println("No recibe bonificacion");

		}

	}

}
