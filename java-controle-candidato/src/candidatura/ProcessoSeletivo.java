package candidatura;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		
		System.out.println("Processo Seletivo");
		
		analisarCandidato(1900.00,"Pedro Brito");
		analisarCandidato(2000.00,"João Da Silva");
		analisarCandidato(2200.00,"Antonio Alves");
		
	}
	
	static void analisarCandidato(double salarioPretendido, String nomeCandidato) {
		
		double salarioBasico = 2000.00;
		
		if(salarioBasico > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO: " + nomeCandidato + " PARA CONTRATAR ELE");
		}else if(salarioBasico == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO: " + nomeCandidato + " COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDAR COM O CANDIDATO: " + nomeCandidato + " PELOS OUTROS CANDIDATOS");
		}
		
	}

}
