package controller;

public class fatcontroller {
	/*3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
	recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
	O código deve trazer como comentários:
	A condição de parada
	Como escrever a função para o termo n em função do termo anterior*/
	
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
