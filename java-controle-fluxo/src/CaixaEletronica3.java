
public class CaixaEletronica3 {
	
public static void main (String [] args) {
		
		double saldo = 25.00;
		double valorSolicitado = 28.00;
		
		String resultado = valorSolicitado < saldo ? "Saque Aprovado" : "Saldo Insuficiente";
				
		System.out.println(resultado);
	}

}
