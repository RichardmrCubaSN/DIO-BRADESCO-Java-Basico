
public class ExemploForArray {
	
	public static void main (String [] args) {
			
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS", "ANA" };
		
		// Condição padrão 
		
		for( int x = 0; x < alunos.length; x ++ ) {
			
			System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
			
		}
		
		System.out.println("");
		
		// Condição abreviada for each
		
		
		for( String aluno : alunos ) {
			
			System.out.println("Nome do aluno é  " + aluno);
			
		}
		
		
			
	}

}
