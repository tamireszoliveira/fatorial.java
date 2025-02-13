package controller;

public class fatcontroller {
	
	
	public fatcontroller(){
		super();
	}
	public static int fatorial(int n) {
		int f = n;
		// condição de parada é n ==1
		if(f == 1) {
			return n;
		} else {
			// o valor de n será f * seu decremento, até chegar no ponto de parada
			n = f * fatorial( f-1);
			return n;
		}
	}
}
