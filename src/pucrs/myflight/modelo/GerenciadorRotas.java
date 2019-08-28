package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

<<<<<<< HEAD
    public void adicionar(CiaAerea cia, Aeronave origem, Aeronave destino, Aeronave aeronave){
        rotas.add(new Rota(cia,origem,destino,aeronave));
    }

    public ArrayList<Rota> listarTodos(){

    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
        for(Rota rota: rotas){
            if(rota.getOrigem().equals(orig)){
                return rota;
            }
        }
    }
=======
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

>>>>>>> 4e3fc46732a302ddcfea562df5e9ef9bbed6bc3a
}
