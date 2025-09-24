import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int a, b, c, d;

		Scanner scan = new Scanner(System.in);

		System.out.println("escreva 4 números:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		System.out.println("diferença entre o produto dos 4 números informados: " + (a*b - c*d));
		
		scan.close();
	}
}
