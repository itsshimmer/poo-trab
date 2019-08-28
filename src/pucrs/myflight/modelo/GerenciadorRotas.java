package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return rotas;
    }

    public Rota buscarPorOrigem(String origem) {
        for (Rota rot: rotas) {
            if(rot.getOrigem().getNome().compareTo(origem)==0) {

                return rot;
            }
        }
        return null;
    }

    public Rota buscarPorDestino(String destino) {
        for (Rota rot: rotas) {
            if(rot.getDestino().getNome().compareTo(destino)==0) {
                return rot;
            }
        }
        return null;
    }

}
