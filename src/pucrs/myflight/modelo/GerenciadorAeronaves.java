package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }

<<<<<<< HEAD
    
=======
    public void inserir_aeroporto(Aeronave aero) {
        aeronaves.add(aero);
    }

    public ArrayList<Aeronave> get_aero() {
        return aeronaves;
    }

    public Aeronave pesquisar(String codigo) {
        for (Aeronave aero: aeronaves) {
            if(aero.getCodigo().compareTo(codigo)==0) {
                return aero;
            }
        }
        return null;
    }

>>>>>>> 4e3fc46732a302ddcfea562df5e9ef9bbed6bc3a
}

