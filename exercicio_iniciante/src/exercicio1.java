import java.util.Scanner;

public class exercicio1 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o primeiro número:");
		double x = scan.nextDouble();
		
		System.out.println("digite o segundo número:");
		double y = scan.nextDouble();
		
		System.out.println("Soma: " + x + " + " + y + " = " + (x + y));
		
		scan.close();
	}
}
