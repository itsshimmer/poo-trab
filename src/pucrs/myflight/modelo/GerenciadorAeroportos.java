package pucrs.myflight.modelo;
import java.util.ArrayList;;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void inserir_aeroporto(Aeroporto aerop) {
        aeroportos.add(aerop);
    }

    public ArrayList<Aeroporto> get_aerop() {
        return aeroportos;
    }

    public Aeroporto pesquisar(String codigo) {
        for (Aeroporto aerop: aeroportos) {
            if(aerop.getCodigo().compareTo(codigo)==0) {
                return aerop;
            }
        }
        return null;
    }


}
