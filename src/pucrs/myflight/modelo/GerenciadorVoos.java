package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
}