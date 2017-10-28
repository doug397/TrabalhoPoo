package br.com.test;

import br.com.logica.Direta;
import br.com.logica.Rota;

public class App {

	public static void main(String[] args) {
	
		
		Rota r1= new Direta("EW1","Salvaror","Rio Janeiro",100.00,0.18 );
		
		Rota r2= new Direta("EW1","Sao Paulo","Rio Janeiro",80.00,0.20 );
		
		System.out.println(r1);
		System.out.println(r2);

	}

}
