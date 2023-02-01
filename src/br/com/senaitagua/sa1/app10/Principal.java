package br.com.senaitagua.sa1.app10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Seja bem vindo ao Banco SS");

		int senha = 0;
		int cont = 0;
		while (senha != 123) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha do cartão: "));

			if (senha == 123) {
				JOptionPane.showMessageDialog(null, "Pode sacar");
				break;
			} else {
				cont++;
				JOptionPane.showMessageDialog(null, "Senha INCORRETA\nRestam: " + (3 - cont) + " tentativas");
			}
			
			if(cont >= 3) {
				JOptionPane.showMessageDialog(null, "CARTÃO BLOQUEADO");
				break;
			}
		}

	}

}
