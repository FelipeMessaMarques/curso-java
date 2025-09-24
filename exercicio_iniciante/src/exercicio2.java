import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {

	public static void main (String[] args) {
		
		double pi = 3.14159; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o valor do raio: ");
		double raio = scan.nextDouble();
		
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("O valor da área é este: %.4f", area);
		
		scan.close();
	}
}
