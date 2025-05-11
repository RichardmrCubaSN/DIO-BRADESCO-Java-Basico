
public class FormatadorCepExemplo {
	
	public static void main(String[] args) {
		
		try {
		
			String cepFormatado = formatarCep("23765064");
			System.out.println("O Cep é ->" + cepFormatado);
			
		} catch (CepInvalidadoException e) {
			
			System.out.println("O Cep Não Corresponde as Regras de Negocio");
			
		}
		
	}
	
	static String formatarCep(String cep) throws CepInvalidadoException{
        if(cep.length() != 8)
          throw new CepInvalidadoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
