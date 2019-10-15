package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {
    private Rota rotaFinal;
    private ArrayList<Rota> rotas;


    public VooEscalas( Rota rotaFinal, LocalDateTime datahora) {
        super(datahora);
        this.rotaFinal = rotaFinal;
        this.rotas =  new ArrayList<>();
    }

    public Rota getRotaFinal() {
        return rotaFinal;
    }

    public void setRotaFinal(Rota rotaFinal) {
        this.rotaFinal = rotaFinal;
    }

    public void adicionarRota(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }

    @Override
    public Duration getDuracao() {
        return null;
    }

    @Override
    public Rota getRota() {
        return null;
    }
}
