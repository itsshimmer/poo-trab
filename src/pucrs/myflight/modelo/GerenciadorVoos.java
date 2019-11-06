package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }


    public void adicionar(Voo voo) {
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public Voo buscarData(LocalDateTime data) {
        for (Voo voo : voos) {
            if (voo.getDatahora().compareTo(data) == 0) {
                return voo;
            }
        }
        return null;
    }

    public void ordenaDataHora () {
        voos.sort(
                Comparator.comparing(a -> a.getDatahora())
        );
    }

    public void ordenaDataHoraDuracao () {
        voos.sort(
                Comparator.comparing(Voo::getDatahora).thenComparing(a -> a.getDuracao())
        );
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < voos.size(); i++){
            s.append(voos.get(i).toString());
        }

        return s.toString();
    }
}