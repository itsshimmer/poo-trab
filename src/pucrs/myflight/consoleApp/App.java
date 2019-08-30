package pucrs.myflight.consoleApp;

public class App {

	public static void main(String[] args) {
		System.out.println("MyFlight project...");

		CiaAerea c1 = new CiaAerea("JJ","LATAM Linhas Aéreas");
		CiaAerea c2 = new CiaAerea("G3","Gol Linhas Aéreas SA");
		CiaAerea c3 = new CiaAerea("TP","TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD","Azul Linhas Aéreas");
		
		System.out.println("Código de c1: " + c1.getCodigo());
		System.out.println("Nome de c2: " + c2.getNome());
		System.out.println("C3:" + c3.toString());

		GerenciadorCias cias = new GerenciadorCias();
		cias.inserir(c1);
		cias.inserir(c2);
		cias.inserir(c3);

		for(CiaAerea c : cias.getCias()){
			System.out.println(c);
		}

		CiaAerea c5 = cias.pesquisar("AA");
		System.out.println(c5);
		CiaAerea c6 = cias.pesquisar("JJ");
		System.out.println(c6);
	}
}
