package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void ordenaNome(){
        Collections.sort(rotas);
    }

    public void ordenaCia() {
        rotas.sort(
                Comparator.comparing((Rota r) -> r.getCia().getNome())
        );
    }

    public void ordenaOrigem() {
        rotas.sort(
                Comparator.comparing(((Rota r) -> r.getOrigem().getNome()))
        );
    }

    public void ordenaOrigemCia() {
        rotas.sort (
                Comparator.comparing((Rota r) -> r.getOrigem().getNome()).thenComparing((Rota r) -> r.getCia().getNome())
        );
    }



}
