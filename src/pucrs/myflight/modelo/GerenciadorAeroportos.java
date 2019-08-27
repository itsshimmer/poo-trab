package pucrs.myflight.modelo;
import java.util.ArrayList;;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void inserir(Aeroporto aerop) {
        aeroportos.add(aerop);
    }

    public ArrayList<Aeroporto> getTodos() {
        return aeroportos;
    }

    public Aeroporto pesquisarCodigo(String codigo) {
        for (Aeroporto aerop: aeroportos) {
            if(aerop.getCodigo().compareTo(codigo)==0) {
                return aerop;
            }
        }
        return null;
    }


}
