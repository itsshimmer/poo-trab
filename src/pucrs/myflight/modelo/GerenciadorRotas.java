package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void inserir_aeroporto(Rota rot) {
        rotas.add(rot);
    }

    public ArrayList<Rota> get_rot() {
        return rotas;
    }

    public Rota pesquisar(String origem, String destino) {
        for (Rota rot: rotas) {
            if(rot.getOrigem().getNome().compareTo(origem)==0 && rot.getDestino().getNome().compareTo(destino) == 0) {

                return rot;
            }
        }
        return null;
    }

}
