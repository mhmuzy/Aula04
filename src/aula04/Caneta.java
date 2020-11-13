package aula04;

public class Caneta {
	// *** Atributos
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String modelo, String cor, float ponta) { // Este é o método Construtor
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}

	// *** Métodos
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}
	
	public void setTampada(boolean t) {
		this.tampada = t;
	}
	
}
