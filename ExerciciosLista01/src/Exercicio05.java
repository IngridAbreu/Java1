import java.util.Scanner;
public class Exercicio05 {
	/*5 - Escreva um programa que verifique se um n�mero � um pal�ndromo ou n�o.
	Exemplo de entrada :
	12321
	Sa�da esperada:
	12321 � um n�mero pal�ndromo*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3 = 0;
		
		System.out.printf("Insira um n�mero: ");
		numero1 = scan.nextInt();
		
		numero2 = numero1;
		
		while(numero2 != 0) {
			numero3 = numero3 * 10 + (numero2 % 10);
			numero2 = (numero2 / 10);
		}
		
		if(numero3 == numero1) {
			System.out.println(numero1 + " � um pal�ndromo. ");
		}
		else {
			System.out.println(numero1 + " n�o � um pal�ndromo. ");
		}
	
	scan.close();
	}

}
