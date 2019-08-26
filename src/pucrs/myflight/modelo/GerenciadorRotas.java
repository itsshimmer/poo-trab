package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

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
}
