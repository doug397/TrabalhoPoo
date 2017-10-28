package br.com.logica;

public abstract class Rota {
	private String id;
	private String origem;
	private String destino;
	private double capacidadeTotal;
	private double custo;
	
	public Rota(String id, String origem, String destino, double capacidadeTotal, double custo) {
		super();
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.capacidadeTotal = capacidadeTotal;
		this.custo = custo;
	}
	
	public abstract double capacidadeTransporte();
	
	
	@Override
	public String toString() {
		return "Rota [id=" + id + ", origem=" + origem + ", destino=" + destino + ", capacidadeTotal=" + capacidadeTotal
				+ ", custo=" + custo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rota other = (Rota) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

}
