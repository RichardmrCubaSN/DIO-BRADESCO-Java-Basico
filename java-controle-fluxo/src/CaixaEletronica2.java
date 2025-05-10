
public class CaixaEletronica2 {
	
public static void main (String [] args) {
		
		double saldo = 25.00;
		double valorSolicitado = 22.00;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		    System.out.println(" Novo Saldo: -> " + saldo);
		}else		
			System.out.println(" Saldo Insuficiente ");
	}

}
