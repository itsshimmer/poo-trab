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
        return null;
    }

    @Override
    public Rota getRota() {
        return rota;
    }
}
