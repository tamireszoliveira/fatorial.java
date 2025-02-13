package view;
import javax.swing.JOptionPane;

import controller.fatcontroller;

public class main {
	/*3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
	recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
	O código deve trazer como comentários:
	A condição de parada
	Como escrever a função para o termo n em função do termo anterior*/
	
	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 1 e 12."));
		if(n > 12 || n < 1) {
			while(n > 12 || n < 1){
				n = Integer.parseInt(JOptionPane.showInputDialog("O número inserido está fora do limite." + "\n" + "Insira um número válido."));
			}
		}
		fatcontroller fat = new fatcontroller();
		System.out.println(n + "! = " + fat.fatorial(n));
	}
}
