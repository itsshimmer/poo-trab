package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }

<<<<<<< HEAD
<<<<<<< HEAD
    
=======
    public void inserir_aeroporto(Aeronave aero) {
        aeronaves.add(aero);
=======
    public void adicionar(Aeronave aviao) {
        aeronaves.add(aviao);
>>>>>>> 1093cdec4978b8d977da5c0a7eaa17805ce94235
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

>>>>>>> 4e3fc46732a302ddcfea562df5e9ef9bbed6bc3a
}

