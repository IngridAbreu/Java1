import java.util.Scanner;
public class Exercicio03 {
	/*3 - Escreva um programa em Java para exibir os n termos do n�mero natural �mpar e sua
	soma.
	Exemplo de entrada :
	N�mero de entrada � : 5
	Sa�da esperada:
	Os n�meros �mpares s�o :
	1
	3
	5
	7
	9
	A soma dos n�meros �mpares naturais at� 5 � : 25*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int contador=0;
		int impar=1;
		int soma;
		int n;
		
		System.out.printf("N�mero de entrada �: ");
		n = scan.nextInt();
		
		while(contador<n) {
			System.out.println(" " + impar);
			impar = impar +2;
			contador = contador + 1;	
		}
		soma = n * n;
		System.out.println("A soma dos n�meros impares naturais �: " + soma);
		scan.close();
	}

}
