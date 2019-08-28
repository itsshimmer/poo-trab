package pucrs.myflight.modelo;

public class Rota {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeronave origem2, Aeronave destino2, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem2;
		this.destino = destino2;
		this.aeronave = aeronave;		
	}

	public CiaAerea getCia() {
		return cia;
	}

	public void setCia(CiaAerea cia) {
		this.cia = cia;
	}

	public Aeroporto getOrigem() {
		return origem;
	}

	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
}
