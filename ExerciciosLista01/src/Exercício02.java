import java.util.Scanner;
public class Exerc�cio02 {
	/*2 - Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit
	Exemplo :
	Entrada :
	Digite o valor da temperatura em Celsius : 10
	Sa�da :
	10 graus Celsius � o mesmo que 50 graus Fahrenheit*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t_celsius;
		int t_fahrenheit;
		
		System.out.printf("Digite o valor da temperatura em Celsius: ");
		t_celsius = scan.nextInt();
		
		t_fahrenheit = ((t_celsius * 9/5) + 32);
		
		System.out.printf(t_celsius + " graus celsius � o mesmo que " + t_fahrenheit + " graus Fahrenheit");
		scan.close();
	}

}
