package view;
import javax.swing.JOptionPane;

import controller.fatcontroller;

public class main {
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
