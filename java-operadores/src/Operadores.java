
public class Operadores {
	
	public static void main (String [] args) {
		
		// Operadores de Atribução (=)
		double salarioMinimo = 2500;
		
		// Operadores de soma ou concatenação (+)
		int soma = 1 + 5;
		int resultadoFinal =(3 * 5) + (15 / 3);
		String meuNome = "Richard" + " " + "Cuba";
		String concatenacao = "?";
	    concatenacao = "1" + (1+1+1);
	    
	 // Operadores Unitarios(+, -, ++, --, !)
	    boolean verdade = false;
	    verdade = ! verdade;
	    
	    int numero = 5;
	    int resultado1 = + numero;
		int resultado2 = - numero;
		int resultado3 = ++ numero;
		int resultado4 = -- numero;
	
	// Operadores Ternarios
	    int a,b;
	    String resultadoTernario1;
	    String resultadoTernario2;
	    
	    a = 5;
	    b = 6;
	    
	    if(a==b)
	    	resultadoTernario1 = "Verdadeiro";
	    else
	    	resultadoTernario1 = "Falso";
	    
	    resultadoTernario2 = a==b ? "Verdadeiro" :"Falso";
	    
	 // Operadores Relacionais
	    
	    int numero1 = 1;
	    int numero2 = 2;
	    
	    boolean senao1 = numero1 == numero2;
	    boolean senao2 = numero1 != numero2;
	    boolean senao3 = numero1 > numero2;
	    boolean senao4 = numero1 < numero2;
	    
	    String nome01 = "Richard";
	    String nome02 = "Richard";	    
	    boolean senao5 = nome01 == nome02;
	    
	    String nome03 = new String ("Richard");
	    boolean senao6 = nome01 == nome03;
	    boolean senao7 = nome01.equals(nome03);
	    
	// Operadores Relacionais 
	    String resposta01 = "";
	    String resposta02 = "";
	     
	    boolean condicao1 = true;
	    boolean condicao2 = false;
	    
	    if(condicao1 && condicao2){
	    	resposta01 = "As duas condições são Verdadeiras";
	    }
	    
	    if(condicao1 || condicao2){
	    	resposta02 = "Uma das duas condições é Verdadeira";
	    }
	
	// Todas as salidas 
		System.out.println("Salario Minimo é ");
		System.out.println(salarioMinimo);
		System.out.println("-----------------");
		System.out.println("Soma é ");
		System.out.println(soma);
		System.out.println("-----------------");
		System.out.println("Resultado Final é ");
		System.out.println(resultadoFinal);
		System.out.println("-----------------");
		System.out.println("Meu Nome Completo é");
		System.out.println(meuNome);
		System.out.println("-----------------");
		System.out.println("Concatencao é");
		System.out.println(concatenacao);
		System.out.println("-----------------");
		System.out.println("Operadores Unitarios");
		System.out.println(verdade);
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println("-----------------");
		System.out.println("Operadores Ternarios");
		System.out.println("Saida com if");
		System.out.println(resultadoTernario1);
		System.out.println("Saida Ternaria");
		System.out.println(resultadoTernario2);
		System.out.println("-----------------");
		System.out.println("Operadores Relacionais");
		System.out.println("NumeroUm é igual a NumeroDois é " + senao1);
		System.out.println("NumeroUm é Diferente a NumeroDois é " + senao2);
		System.out.println("NumeroUm é Maior a NumeroDois é " + senao3);
		System.out.println("NumeroUm é Menor a NumeroDois é " + senao4);
		System.out.println("Usando Operadores relacionais para comparar um string o resultado é " + senao5);
		System.out.println("Usando Operadores relacionais para comparar um objeto o resultado é " + senao6);
		System.out.println("Usando Funcão Equals para comparar um objeto o resultado é " + senao7);
		System.out.println("-----------------");
		System.out.println("Operadores Logicos");
		System.out.println(resposta01);
		System.out.println(resposta02);
	}

}
