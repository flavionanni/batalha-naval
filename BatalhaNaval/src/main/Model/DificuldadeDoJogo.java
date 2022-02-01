package Model;

public enum DificuldadeDoJogo {
	
//	quantidadeDeNavios
	FACIL(15),
	MEDIO(11),
	DIFICIL(7),
	PROFISSIONAL(3);
	
	private int quantidadeDeNavios;
	
	private DificuldadeDoJogo(int quantidadeDeNavios) {
		this.quantidadeDeNavios = quantidadeDeNavios;
	}

	public int getQuantidadeDeNavios() {
		return quantidadeDeNavios;
	}
}
