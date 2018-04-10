package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadora {
	static Integer valorMenu = 0;
	static Scanner teclado = new Scanner(System.in);	
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		while (valorMenu != 3) {
			if (valorMenu == 0) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.somar();
				chamarMenu();
			} else if (valorMenu == 2) {
				System.err.println(calculadora.getResultados());
				chamarMenu();
			} else if (valorMenu == 3) {
				System.exit(0);
			}else{
				chamarMenu();
			}
			
			
		}
	}

	private static void chamarMenu() {		
		System.err.println("#########################");
		System.err.println("MENU");
		System.err.println("1:SOMAR");
		System.err.println("4:SUBTRAIR");
		System.err.println("5:MULTIPLICAR");
		System.err.println("6:DIVIDIR");
		System.err.println("2:IMPRIMIR");
		System.err.println("3:SAIR");
		valorMenu = teclado.nextInt();
	}
	
}