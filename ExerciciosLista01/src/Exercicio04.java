import java.util.Scanner;
public class Exercicio04 {
	/*4 - Escreva um programa que imprima o seguinte padr�o de n�mero em formato de
	tri�ngulo dado um n�mero n.
	Exemplo de entrada :
	4
	Sa�da esperada:
	1
	12
	123
	1234*/
	public static void main(String[] args) {
		int numero , contador1, contador2;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite um n�mero: ");
		numero = scan.nextInt();
		
		contador1 = 1;
		
		for(contador1 = 1; contador1 <= numero; contador1++) {
			for(contador2 = 1; contador2 <= contador1 ; contador2++) {
				System.out.printf(contador2 + "");
			}
			System.out.printf("\n");
		}
	}
}
