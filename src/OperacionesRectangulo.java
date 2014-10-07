import java.util.Scanner;

public class OperacionesRectangulo
{

	public static void main (String args[]) 
	{

		// Inicializar las variables (Constructor)
		double alt = 0, bs = 0;
		double area;
		//Antes de constructor
		//Rectangulo operaciones = new Rectangulo();

		// Constructor
		Rectangulo rectangulo = new Rectangulo(bs, alt);
		area = rectangulo.Area();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa la altura del rectangulo: ");
		alt = sc.nextDouble();
		
		System.out.print("\nIngresa la base del rectangulo: ");
		bs = sc.nextDouble();
		
		rectangulo.setBase(bs);
		rectangulo.setAltura(alt);

		System.out.println("\nEl AREA del rectangulo es: " + rectangulo.Area() + "cm");
		System.out.println("\nEl PERIMETRO del rectangulo es: " + rectangulo.Perimetro() + "cm");
	
		//System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
