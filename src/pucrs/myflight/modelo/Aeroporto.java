package pucrs.myflight.modelo;

public class Aeroporto {
	private String codigo;
	private String nome;
	private Geo local;
	
	public Aeroporto(String codigo, String nome, Geo local) {
		this.codigo = codigo;
		this.nome = nome;
		this.local = local;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Geo getLocal() {
		return local;
	}
}
