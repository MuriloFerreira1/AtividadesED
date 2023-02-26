package controller;
import javax.swing.JOptionPane;

import controller.Controller;
public class main {

	public static void main(String[] args) {
		Controller c = new Controller();
		int resultado=0;
		int opc=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog("Insira o exercício: "));
			switch (opc) {
			case 1:
				int entrada =Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da fatoral: "));
				resultado = c.ex01Fatorial(entrada);
				JOptionPane.showMessageDialog(null, "O valor da fatoração é: "+resultado);
				break;
			case 2:
				int tamanho=Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor: "));
				int vetor[] = new int[tamanho];
				for(int i=0;i<tamanho;i++) {
					vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição: "+(i+1)));
				}
				resultado = c.ex02NegativosVetor(vetor, tamanho);
				JOptionPane.showMessageDialog(null, "O número de negativos é: "+resultado);
				break;
			case 3:
				int numero=Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser contado: "));
				resultado = c.ex03DigitosInteriro(numero);
				JOptionPane.showMessageDialog(null, "O número possui: "+resultado+" casas");
				break;
			case 4:
				String frase = JOptionPane.showInputDialog("Insira o texto a ser Invertido");
				String textoFinal=c.ex04Inverter(frase, frase.length());
				JOptionPane.showMessageDialog(null, "O texto invertido resulta em: \n"+textoFinal);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
				break;
			}
		}while (opc!=0);
	}

}
