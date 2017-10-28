package br.com.logica;

public class Direta extends Rota {

	public Direta(String id, String origem, String destino, double capacidadeTotal, double custo) {
		super(id, origem, destino, capacidadeTotal, custo);
		
	}

	@Override
	public double capacidadeTransporte() {
		// TODO Auto-generated method stub
		return 0;
	}

}
