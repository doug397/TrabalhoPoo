package br.com.logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fracionada extends Rota {
	private  Set<Direta> subRotas;
	
	public Fracionada(String id, String origem, String destino, double capacidadeTotal, double custo) {
		super(id, origem, destino, capacidadeTotal, custo);
		this.subRotas = new HashSet<Direta>();
	}

	@Override
	public double capacidadeTransporte() {
		// TODO Auto-generated method stub
		return 0;
	}



}
