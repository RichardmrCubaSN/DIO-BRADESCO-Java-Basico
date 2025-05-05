
public class Comentarios {
	
	public static void main (String [] args) {
	// Olá sou um comentário de uma única linha.
	
	/* Olá,
	 * Eu sou um comentário
	 * que posso ser mais detalhado
	 * quando sea necessário
	 */		
	}
	
	/**
	 * Está duas estrelinhas acima
	 * é para identificar que você
	 * pretende elaborar um comentário
	 * a nível de documentação.
	 * que incrível !!!
	 */
	
	public void metodo() {
		
	}
	
	public int somaMultiplica (int n, int x, String m) {
		int r =0; // r é o resultado
		if(m == "M") { //Multiplicação
			r = n * x;
		}else {
			//Senão é soma mesmo
			r = n + x;
		}
		return r;
	}
	
}
