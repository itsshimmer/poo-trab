package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

<<<<<<< HEAD
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
=======
    public void adicionar(Rota rota) {
        rotas.add(rota);
>>>>>>> 1093cdec4978b8d977da5c0a7eaa17805ce94235
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

<<<<<<< HEAD
>>>>>>> 4e3fc46732a302ddcfea562df5e9ef9bbed6bc3a
=======
    public Rota buscarPorDestino(String destino) {
        for (Rota rot: rotas) {
            if(rot.getDestino().getNome().compareTo(destino)==0) {
                return rot;
            }
        }
        return null;
    }

>>>>>>> 1093cdec4978b8d977da5c0a7eaa17805ce94235
}
