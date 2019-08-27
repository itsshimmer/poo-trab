package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void inserir(Rota rot) {
        rotas.add(rot);
    }

    public ArrayList<Rota> getTodos() {
        return rotas;
    }

    public Rota pesquisarOrigem(String origem) {
        for (Rota rot: rotas) {
            if(rot.getOrigem().getNome().compareTo(origem)==0) {

                return rot;
            }
        }
        return null;
    }

    public Rota pesquisarDestino(String destino) {
        for (Rota rot: rotas) {
            if(rot.getDestino().getNome().compareTo(destino)==0) {
                return rot;
            }
        }
        return null;
    }

}
