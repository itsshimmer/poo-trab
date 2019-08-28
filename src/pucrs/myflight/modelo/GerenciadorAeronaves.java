package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao) {
        aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        return aeronaves;
    }

    public Aeronave buscaPorCodigo(String codigo) {
        for (Aeronave aero: aeronaves) {
            if(aero.getCodigo().compareTo(codigo)==0) {
                return aero;
            }
        }
        return null;
    }

}

