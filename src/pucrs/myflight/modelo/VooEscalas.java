package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {
    private Rota rotaFinal;
    private ArrayList<Rota> rotas;


    public VooEscalas(ArrayList<Rota> conexoes, LocalDateTime datahora) {
        super(datahora);
        this.rotas = conexoes;
    }



    @Override
    public Duration getDuracao() {
        Duration aux = Duration.ofMinutes(0);
        for (int i = 0; i < rotas.size(); i++){
            aux.plus(Duration.ofMinutes((long) Geo.distancia(rotas.get(i).getOrigem().getLocal(), rotas.get(i).getDestino().getLocal()) / 805));
            aux.plus(Duration.ofMinutes(30));
        }

        return aux;
    }

    public void setRotaFinal(){
        this.rotaFinal = new Rota (rotas.get(0).getCia(), rotas.get(0).getOrigem(), rotas.get(rotas.size()).getDestino(), rotas.get(0).getAeronave());
    }

    @Override
    public Rota getRota() {
        return rotaFinal;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(this.getClass());
        return s.toString();
    }




}
