package br.com.caelum.contas.modelo;

public class TestaTributavel {

	public static void main(String[] args) throws IllegalArgumentException {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		
		//testando polimorfismo:
		/*
		Tributavel t= cc;
		System.out.println(t.getValorImposto());
		*/
	}

}
