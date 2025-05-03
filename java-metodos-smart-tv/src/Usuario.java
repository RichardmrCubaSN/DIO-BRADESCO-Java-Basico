
public class Usuario {

	public static void main (String [] args) throws Exception {
		
		SmartTv smartTv =  new SmartTv();
		
		System.out.println("--------------------");
		System.out.println("Estado Inicial da TV");
		System.out.println("--------------------");
		System.out.println("TV está ligada -> " + smartTv.ligada );
		System.out.println("Volume atual da TV -> " + smartTv.volume );
		System.out.println("Canal atual da TV -> " + smartTv.canal );
		
		
		smartTv.ligar ();
		smartTv.disminuirVolume ();
		smartTv.disminuirVolume ();
		smartTv.disminuirVolume ();
		smartTv.disminuirVolume ();
		smartTv.aumentarCanal ();
		smartTv.aumentarCanal ();
		smartTv.aumentarCanal ();
		smartTv.aumentarCanal ();
		smartTv.aumentarCanal ();
		smartTv.aumentarCanal ();
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Estado Novo da TV");
		System.out.println("--------------------");
		System.out.println("TV está ligada -> " + smartTv.ligada );
		System.out.println("Volume atual da TV -> " + smartTv.volume );
		System.out.println("Canal atual da TV -> " + smartTv.canal );
		
		
		smartTv.desligar ();
		smartTv.aumentarVolume ();
		smartTv.aumentarVolume ();
		smartTv.aumentarVolume ();
		smartTv.aumentarVolume ();
		smartTv.aumentarVolume ();
		smartTv.aumentarVolume ();
		smartTv.disminuirCanal ();
		smartTv.disminuirCanal ();
		smartTv.disminuirCanal ();
		smartTv.disminuirCanal ();
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Estado atual da TV");
		System.out.println("--------------------");
		System.out.println("TV está ligada -> " + smartTv.ligada );
		System.out.println("Volume atual da TV -> " + smartTv.volume );
		System.out.println("Canal atual da TV -> " + smartTv.canal );
		
		smartTv.mudarCanal (13);
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Canal da TV -> " + smartTv.canal );
		
	}
}
