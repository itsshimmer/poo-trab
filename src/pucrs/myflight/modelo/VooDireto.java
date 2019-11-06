package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
    private Rota rota;

    public VooDireto(LocalDateTime dh, Rota rota){
        super(dh);
        this.rota = rota;
    }


    @Override
    public Duration getDuracao() {


        Duration aux = Duration.ofMinutes(30 + ((long) Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal()) / 805));
        return aux;
    }

    @Override
    public Rota getRota() {
        return rota;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(getDuracao());
        s.append("\n");
        s.append(getDatahora());
        return s.toString();
    }


}
