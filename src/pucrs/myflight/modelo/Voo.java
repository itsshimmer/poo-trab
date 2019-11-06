package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {

	public enum Status { CONFIRMADO, ATRASADO, CANCELADO }

	private LocalDateTime datahora;
	private Status status;

	public Voo( LocalDateTime datahora) {
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}

	public abstract Duration getDuracao();

	public abstract  Rota getRota();

	public Status getStatus(){return status;}

	public void setStatus(Status status) {
		this.status = status;
	}

	public abstract String toString();


}