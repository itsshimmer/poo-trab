package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	/*public void inserir(String cod, String nome) {
		empresas.add(new CiaAerea(cod, nome));
	}*/

	public void inserir(CiaAerea cia) {
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> getTodos() {
		return empresas;
	}

	public CiaAerea pesquisarCodigo(String codigo) {
		for (CiaAerea cia: empresas) {
			if(cia.getCodigo().compareTo(codigo)==0) {
				return cia;
			}
		}
		return null;
	}

	public CiaAerea pesquisarNome(String nome) {
		for (CiaAerea cia: empresas) {
			if(cia.getNome().compareTo(nome)==0) {
				return cia;
			}
		}
		return null;
	}

}
