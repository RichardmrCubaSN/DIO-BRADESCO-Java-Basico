import java.util.Scanner;

public class ContaTerminal {
	public static void main (String [] args) throws Exception {
		
		// TODO: Conhecer e importar a classe Scanner.
		 Scanner scanner = new Scanner(System.in);		
		
		// Exibir as mensagens para o nosso usuario.
		 
		    System.out.println("--------------------------------");
		    System.out.println(" Aperturando uma Conta no Banco ");
		    
		    System.out.println("--------------------------------");		    
		 	System.out.println("Por favor, digite o número da Conta:");
		 	int numero = Integer.parseInt(scanner.nextLine());	        
	        
	        System.out.println("Por favor, digite o número da Agência:");
	        String agencia = scanner.nextLine();

	        System.out.println("Por favor, digite o nome do Cliente:");
	        String nomeCliente = scanner.nextLine();

	        System.out.println("Por favor, digite o saldo:");
	        double saldo = Double.parseDouble(scanner.nextLine());
	       
	        System.out.println("--------------------------------");
	        System.out.println("");
	        System.out.println("");	       
		
		// Obter pelo Scanner os valores digitados no terminal.
	        
	        System.out.println("--------------------------------");
		    System.out.println("     Novo cliente do banco      ");
		    System.out.println("--------------------------------");
		    System.out.println("Número da Conta: -> " + numero );
		    System.out.println("Número da Agência: -> " + agencia);
		    System.out.println("Nome do Cliente: -> " + nomeCliente);
		    System.out.println("Saldo: -> " + saldo);
		    System.out.println("");
	        System.out.println("");
		
		// Exibir a mensagem da conta criada.
		    System.out.println("--------------------------------");
		    System.out.println("     Conta criada com sucesso   ");
		    System.out.println("--------------------------------");
		    scanner.close();
	}

}
