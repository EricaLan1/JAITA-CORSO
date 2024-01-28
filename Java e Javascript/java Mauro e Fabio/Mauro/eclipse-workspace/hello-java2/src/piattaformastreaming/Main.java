package piattaformastreaming;


public class Main {

	public static void main(String[] args) {
		Contenuto contenuto = new Contenuto();
		contenuto.setTitolo("Java class");
		contenuto.play();
		
		Serie javaSerie = new Serie();
		javaSerie.setTitolo("Java playlist");
		javaSerie.setStagione(1);
		javaSerie.setNumerodiEpisodi(10);
		javaSerie.play();
		
		Film avatar = new Film();
		avatar.setTitolo("Avatar");
		avatar.setLunghezza(2500);
		avatar.play();
	}

}
