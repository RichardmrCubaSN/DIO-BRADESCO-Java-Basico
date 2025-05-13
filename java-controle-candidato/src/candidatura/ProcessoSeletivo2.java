package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Processo Seletivo");
		System.out.println("");
		//selecaoCandidatos();
		//imprimirSelecionados();
		String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		
		for(String candidato: candidatos) {
			
			entrandoEmContato(candidato);		
			
		}
		
	}
	
	
	
	static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas ++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
						
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas +  " TENTATIVAS");
		else
			System.out.println("NÂO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
			
		
	}
	
	
	// Metodo auxiliar
	static boolean atender() {
		
		return new Random().nextInt(3)==1;
		
	}
	
	
		
	static void imprimirSelecionados() {
		
		String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		
		System.out.println("Imprimiendo a lista de candidatos e informando o indice do elemento");
		System.out.println("");
		
		for(int indice = 0; indice < candidatos.length; indice ++) {
			
			System.out.println("O candidato de N° " + (indice + 1) + " é " + candidatos[indice]);
			
		}
		
		System.out.println("");
		System.out.println("Forma abreviada de interação for/each");
		System.out.println("");
		
		for(String candidato: candidatos) {
			
			System.out.println("O candidato Selecionado foi " + candidato);
			
		}
		
		
	}
	
	
	
	static void selecaoCandidatos() {
		
		String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtuais = 0;
		double salarioBase = 2000.00;
		
		while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
			
			String candidato = candidatos[candidatosAtuais];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato: " + candidato + " solicitou este valor de salario " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				
				System.out.println("O candidato: " + candidato + " Foi seleccionado para a vaga");
				candidatosSelecionados ++;
				
			}
			
			candidatosAtuais ++;
			
		}
		
	}
	
	
	static double valorPretendido() {
		
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
		
	}	
	
	
	static void analisarCandidato(double salarioPretendido) {
		
		double salarioBasico = 2000.00;
		
		if(salarioBasico > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBasico == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
		
	}

}
