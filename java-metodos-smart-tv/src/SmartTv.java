
public class SmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	// Ligar e desligar
	
	public void ligar() {		
		ligada = true;		
	}
	
	public void desligar() {		
		ligada = false;		
	}
	
	
	// Aumentar e disminuir volume
	
	public void aumentarVolume() {		
		// volume = volume + 1;	
		volume ++;
	}
	
	public void disminuirVolume() {		
		// volume = volume - 1;	
		volume --;
	}
	
	
	// Aumentar e disminuir Canais
	
	public void aumentarCanal() {		
		// canal = canal + 1;	
		canal ++;
	}
	
	public void disminuirCanal() {		
		// canal = canal - 1;	
		canal --;
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
}
