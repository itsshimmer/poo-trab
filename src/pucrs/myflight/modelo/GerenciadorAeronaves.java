package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }

    public void inserir(Aeronave aero) {
        aeronaves.add(aero);
    }

    public ArrayList<Aeronave> getTodos() {
        return aeronaves;
    }

    public Aeronave pesquisarCodigo(String codigo) {
        for (Aeronave aero: aeronaves) {
            if(aero.getCodigo().compareTo(codigo)==0) {
                return aero;
            }
        }
        return null;
    }

}

