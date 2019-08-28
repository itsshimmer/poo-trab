package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

<<<<<<< HEAD
	public void inserir() {
=======
	/*public void inserir(String cod, String nome) {
>>>>>>> 4e3fc46732a302ddcfea562df5e9ef9bbed6bc3a
		empresas.add(new CiaAerea(cod, nome));
	}*/

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas() {
		return empresas;
	}

	public CiaAerea buscarCodigo(String codigo) {
		for (CiaAerea cia: empresas) {
			if(cia.getCodigo().compareTo(codigo)==0) {
				return cia;
			}
		}
		return null;
	}

	public CiaAerea buscarNome(String nome) {
		for (CiaAerea cia: empresas) {
			if(cia.getNome().compareTo(nome)==0) {
				return cia;
			}
		}
		return null;
	}

}
