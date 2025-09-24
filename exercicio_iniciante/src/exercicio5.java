import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos produtos você quer passar:");
		int numberProducts = scan.nextInt();
		
		double mountFull = 0;

		for (int i = 1; i <= numberProducts; i++) {

			System.out.printf("Código do produto %d: ", i);
			int codeProduct = scan.nextInt();

			System.out.printf("Número de peças do produto %d: ", i);
			int numberPieces = scan.nextInt();

			System.out.printf("Valor unitário produto %d: ", i);
			double mountProduct = scan.nextDouble();
			
			mountFull += numberPieces * mountProduct;
		}
		
		System.out.printf("Valor a pagar: R$%.2f", mountFull);
	}
}
