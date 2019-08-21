package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void inserir(String cod, String nome) {
		empresas.add(new CiaAerea(cod, nome));
	}

	public ArrayList<CiaAerea> getCias() {
		return empresas;
	}

	public CiaAerea pesquisar(String codigo) {
		for (CiaAerea cia: empresas) {
			if(cia.getCodigo().compareTo(codigo)==0) {
				return cia;
			}
		}
		return null;
	}

}
