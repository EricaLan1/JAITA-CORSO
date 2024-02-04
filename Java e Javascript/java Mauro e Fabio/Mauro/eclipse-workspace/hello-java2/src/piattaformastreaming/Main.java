package piattaformastreaming;


public class Main {

	public static void main(String[] args) {
		Contenuto contenuto = new Contenuto("Java class");
		contenuto.setTitolo("Java class");
		contenuto.play();
		System.out.println(contenuto);
		
		Serie javaSerie = new Serie("Java playlist",1,10);
		javaSerie.setTitolo("Java playlist");
		javaSerie.setStagione(1);
		javaSerie.setNumerodiEpisodi(10);
		javaSerie.play();
		System.out.println(javaSerie);
		
		Film avatar = new Film("Avatar",2500);
		avatar.setTitolo("Avatar");
		avatar.setLunghezza(2500);
		avatar.play();
		System.out.println(avatar);
		
		// posso unire in un array oggetti diversi purché abbiano una superclasse in comune
		
		Contenuto[] playList = { contenuto, javaSerie, avatar};
		
		for (int i = 0; i < playList.length; i++) {
			playList[i].play();
		}
	}

}
