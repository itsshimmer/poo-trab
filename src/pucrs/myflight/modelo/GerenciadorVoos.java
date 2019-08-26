package pucrs.myflight.modelo;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }


    public void inserir_aeroporto(Voo voo) {
        voos.add(voo);
    }

    public ArrayList<Voo> get_aero() {
        return voos;
    }

    public Voo buscar_datas(LocalDate data) {
        for (Voo voo : voos) {
            if (voo.getDatahora()..compareTo(codigo) == 0) {
                return voo;
            }
        }
        return null;
    }
}