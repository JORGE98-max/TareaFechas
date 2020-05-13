import java.util.Scanner;

public class Ejercicio3 {

	static int cate;
	static double sue;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double nsue;

		System.out.println("Ingrese su categoria: ");
		cate = scan.nextInt();

		switch (cate) {

		case 1:
			System.out.println("Ingrese el sueldo: ");
			sue = scan.nextDouble();

			nsue = sue * 1.15;

			System.out.println("Categoria : "+cate);
			System.out.println("Nuevo sueldo : " + nsue);
			break;
		case 2:
			System.out.println("Ingrese el sueldo: ");
			sue = scan.nextDouble();

			nsue = sue * 1.10;

			System.out.println("Categoria : "+cate);
			System.out.println("Nuevo sueldo : " + nsue);
			break;

		case 3:
			System.out.println("Ingrese el sueldo: ");
			sue = scan.nextDouble();

			nsue = sue * 1.08;

			System.out.println("Categoria : "+cate);
			System.out.println("Nuevo sueldo : " + nsue);
			break;

		case 4:
			System.out.println("Ingrese el sueldo: ");
			sue = scan.nextDouble();

			nsue = sue * 1.07;

			System.out.println("Categoria : "+cate);
			System.out.println("Nuevo sueldo : " + nsue);
			break;

		}

	}

}
