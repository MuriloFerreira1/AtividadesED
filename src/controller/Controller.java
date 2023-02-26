package controller;

public class Controller {
	public Controller() {
		super();
	}
	public int ex01Fatorial(int entrada) {
		if(entrada>0) {
			//c�lcudo a multiplica��o do termo atual com os termos anteriores
			return entrada*ex01Fatorial(entrada-1);
		}else {
			//condi��o de parada onde entrada alcan�a 0
			return 1;
		}
	}
	
	public int ex02NegativosVetor(int[] vetor,int n) {
		if(n>0) {
			//checagem do valor
			if(vetor[n-1]<0) {
				//caso a posi��o do vetor seja negativo
				return 1+ex02NegativosVetor(vetor, n-1);
			}else {
				// caso a posi��o do vetor seja positivo ou 0
				return ex02NegativosVetor(vetor, n-1);
			}
		}else {
			//condi��o de parada onde n chega a 0
			return 0;
		}
	}
	
	public int ex03DigitosInteriro(int numero) {
		if(numero>0) {
			//adiciona o digito atual a contagem e passa ao pr�ximo
			return 1+ex03DigitosInteriro(numero/10);
		}else {
			//para caso o n�mero chegue a 0
			return 0;
		}
	}
	
	public String ex04Inverter(String frase, int tamanho){
		if(tamanho>=2) {
			//chama o proximo termo usando um tamanho final menor
			return frase.substring(tamanho-1, tamanho)+ ex04Inverter(frase, tamanho-1);
		}else {
			//a recursiva para quando chegua ao primeiro caractere
			return frase.substring(0,1);
		}
	}
}
