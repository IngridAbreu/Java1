
public class Ex4 {
	/*4. Imprima os fatoriais de 1 a 10.
	O fatorial de um n�mero n � n * (n-1) * (n-2) * ... * 1. 
	Lembre-se de utilizar os par�nteses.
	O fatorial de 0 � 1
	O fatorial de 1 � (0!) * 1 = 1
	O fatorial de 2 � (1!) * 2 = 2
	O fatorial de 3 � (2!) * 3 = 6
	O fatorial de 4 � (3!) * 4 = 24*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int fatorial = 1;
		
		
		for (i=1; i<=10; i++ )
		{
			fatorial = fatorial*i;
			System.out.println( " Fatorial de " + "(" + i + "!) = " + fatorial);
		}

	}

}