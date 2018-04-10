package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadora {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static Float numero1;
	static Float numero2;
	static Calculadora calculadora = new Calculadora();

	public static void main(String[] args) {
		while (valorMenu != 6) {
			if (valorMenu == 1) {
				informarValores();
				calculadora.somar();
				chamarMenu();
			} else if (valorMenu == 2) {
				informarValores();
				calculadora.subtrair();
				chamarMenu();
			} else if (valorMenu == 3) {
				informarValores();
				calculadora.multiplicar();
				chamarMenu();
			} else if (valorMenu == 4) {
				informarValores();
				calculadora.dividir();
				chamarMenu();
			} else if (valorMenu == 5) {
				System.err.println(calculadora.getResultados());
				chamarMenu();
			} else if (valorMenu == 6) {
				System.exit(0);
			} else {
				chamarMenu();
			}
		}
	}

	private static void informarValores() {
		System.err.println("Informe o valor1");
		numero1 = entrada.nextFloat();
		System.err.println("Informe o valor2");
		numero2 = entrada.nextFloat();
		calculadora.setValor1(numero1);
		calculadora.setValor2(numero2);
	}

	private static void chamarMenu() {
		System.err.println("#########################");
		System.err.println("MENU");
		System.err.println("1:SOMAR");
		System.err.println("2:SUBTRAIR");
		System.err.println("3:MULTIPLICAR");
		System.err.println("4:DIVIDIR");
		System.err.println("5:IMPRIMIR");
		System.err.println("6:SAIR");
		try {
			valorMenu = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Menu"));
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
			chamarMenu();
		}
	}
}
