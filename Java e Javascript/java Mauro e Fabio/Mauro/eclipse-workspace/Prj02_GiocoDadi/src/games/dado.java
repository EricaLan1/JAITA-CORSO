package games;

public class dado {

public int facce;
public dado() {
this.facce=6; 

	}
	
public int lancia(){
int i= 1;
//qui devo calcolare un valore casuale tra 1 e 6
//numero delle facce del mio dato
double casuale=Math.random(); //casuale tra 0.0 <1
i=(int)(casuale*facce)+1;

return i;

}


}
