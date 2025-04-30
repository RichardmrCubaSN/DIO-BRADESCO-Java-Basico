package Edu.Richard.Exercicio01;

public class MinhaClasse {
	
	public static void main (String [] args) {
		
		String primeiroNome = "Richard";
		String segundoNome = "Cuba";
		
		String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
		
		System.out.print("Olá Alunos da turma, sejam Bem-vindos");
		System.out.print(nomeCompleto);
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		
		return " Em Especial o Aluno" + " " + primeiroNome.concat(" ").concat(segundoNome);
		
	}
	
}
