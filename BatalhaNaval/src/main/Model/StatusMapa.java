package Model;

public enum StatusMapa {
	
	MAR("~"),
	NAVIO_ATINGIDO("X"),
	TIRO_ERRADO("0");
	
	private String valor;
	
	StatusMapa(String valor) {
		this.valor = valor;
	}
	
	public String getStatusMapa() {
		return  this.valor;
	}
}
