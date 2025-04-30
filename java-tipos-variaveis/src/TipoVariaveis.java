
public class TipoVariaveis {
	
	public static void main (String [] args) {
		
		// Declaração de Variavel numerica simples
		double salarioMinimo = 2500;
		
		// Declaração de Variavel numerica com troca de Tipo
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		// Declaração de Variavel numerica com troca de valor
		int numero = 5;
		numero = 20;
		
		// Declaração de Variavel de texto
		String nome = "Richard";
		String sobrenome = "Cuba";
						
		System.out.println("Salario Minimo é ");
		System.out.println(salarioMinimo);
		System.out.println("-----------------");
		System.out.println("Numero Curto é ");
		System.out.println(numeroCurto2);
		System.out.println("-----------------");
		System.out.println("Numero é ");
		System.out.println(numero);
		System.out.println("-----------------");
		System.out.println("Meu nome e Sobrenome são ");
		System.out.println(nome+ " "+sobrenome);
	}

}
