/*
	5. No c�digo do exerc�cio anterior, aumente a quantidade de n�meros 
	que ter�o os fatoriais impressos,at� 20, 30, 40.
	Em um determinado momento, al�m desse c�lculo demorar, 
	vai come�ar a mostrar respostas completamente erradas. 
	Por qu�? 
	
	Porque o tipo int suportava apenas 4 bytes enquanto o long suporta 8 bytes.
	Por isso foi necess�rio fazer a mudan�a.
*/
public class Ex5 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//int i;
			//int n = 20;
			//int n = 30;
			long  i;
			long  n = 40;
			//int fatorial = 1;
			long  fatorial = 1;
			
			
			for (i=1; i<=n; i++ )
			{
				fatorial = fatorial*i;
				System.out.println( " Fatorial de " + "(" + i + "!) = " + fatorial);
			}

		}

	}
