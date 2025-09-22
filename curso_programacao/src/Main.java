//import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Escreva seu nome:");
		//String nome = scan.nextLine();
		
		//System.out.println("Seu nome é este aqui: " + nome);
		
		double x = 10.35784;
		
		System.out.printf("%.2f%n", x);
				
		 Locale.setDefault(Locale.of("pt", "BR"));
		 
		 System.out.printf("%.2f%n", x);
	}

}
