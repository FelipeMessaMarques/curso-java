import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite o número de A, B e C:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		double triangulo = (a * c) / 2;
		double circulo = 3.14159 * Math.pow(c, 2);
		double trapezio = (a + b) * c /2;
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;
		
		System.out.printf("Trinângulo: %.3f%n", triangulo);
		System.out.printf("Círculo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retângulo: %.3f%n", retangulo);
	}
}
