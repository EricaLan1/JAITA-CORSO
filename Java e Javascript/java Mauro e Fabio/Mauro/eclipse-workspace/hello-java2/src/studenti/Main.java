package studenti;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Studenti studente =  new Studenti("Pinco", "Pallino", "pincopallino@gmail.com", LocalDate.parse("1997-04-08"));
		studente.nomeCompleto();
		LocalDate oggi = LocalDate.now(); /* scriverlo dopo il syso dell'eta*/
		System.out.println(studente.nomeCompleto() + " " + studente.getEta(oggi.getYear()) + " anni");
	}

}
