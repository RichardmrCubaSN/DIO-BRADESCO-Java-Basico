import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
	
	public static void main (String [] args) throws Exception  {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("--------------------------------");
		System.out.println("Digite seu nome");
		String nome = scanner.next();
		System.out.println("--------------------------------");
		System.out.println("Digite seu Sobrenome");
		String sobrenome = scanner.next();
		System.out.println("--------------------------------");
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		System.out.println("--------------------------------");
		System.out.println("Digite sua altura");
		double altura = scanner.nextDouble();
		System.out.println("--------------------------------");
			
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("Olá, me chamo " + nome + " " + sobrenome);
		System.out.println("--------------------------------");
		System.out.println("Tenho " + idade + " anos");
		System.out.println("--------------------------------");
		System.out.println("Minha altura é " + altura + " m");
		System.out.println("--------------------------------");
		
	}

}
