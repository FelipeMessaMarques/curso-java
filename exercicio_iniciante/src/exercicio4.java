import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu número, quantidade de horas e valor hora:");
		int number = scan.nextInt();
		double hour = scan.nextDouble();
		double salaryHour = scan.nextDouble();
		
		double salaryFull = salaryHour * hour;  
		
		System.out.printf("NUMBER = %d%nSALARY U$%.2f", number,  salaryFull);
		
		scan.close();
	}
}
