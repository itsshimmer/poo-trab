package pucrs.myflight.modelo;
import java.util.ArrayList;;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero) {
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos() {
        return aeroportos;
    }

    public Aeroporto buscaPorCodigo(String cod) {
        for (Aeroporto aerop: aeroportos) {
            if(aerop.getCodigo().compareTo(cod)==0) {
                return aerop;
            }
        }
        return null;
    }


}
