
public class ResultadoEscolar3 {
	
public static void main (String [] args) {
		
		int nota = 7;
		
		String resultado = nota >= 7 ? "Aluno Aprovado" : nota >= 5 && nota < 7 ? "Aluno em Recuperação" : "Aluno Reprovado";		
				
		System.out.println(resultado);		
	}

}
