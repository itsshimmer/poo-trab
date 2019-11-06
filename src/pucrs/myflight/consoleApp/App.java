package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		System.out.println("MyFlight project...");

		GerenciadorVoos gVoo = new GerenciadorVoos();
		GerenciadorRotas gRotas = new GerenciadorRotas();
		GerenciadorAeroportos gAeroportos = new GerenciadorAeroportos();
		GerenciadorAeronaves gAeronaves = new GerenciadorAeronaves();
		GerenciadorCias gCias = new GerenciadorCias();

		CiaAerea c1 = new CiaAerea("01", "Primeira Cia");
		CiaAerea c2 = new CiaAerea("02", "Segunda Cia");
		CiaAerea c3 = new CiaAerea("03", "Terceira Cia");
		CiaAerea c4 = new CiaAerea("04", "Quarta Cia");

		gCias.adicionar(c1);
		gCias.adicionar(c2);
		gCias.adicionar(c3);
		gCias.adicionar(c4);

		Aeroporto a1 = new Aeroporto("01", "Primeiro Aeroporto", new Geo(-29.9935, -51.1754));
		Aeroporto a2 = new Aeroporto("02", "Segundo Aeroporto", new Geo(-23.4304, -46.473));
		Aeroporto a3 = new Aeroporto("03", "Terceiro Aeroporto", new Geo(-3.7736, -38.5268 ));
		Aeroporto a4 = new Aeroporto("04", "Quarto Aeroporto", new Geo(-10.985, -37.0749 ));

		gAeroportos.adicionar(a1);
		gAeroportos.adicionar(a2);
		gAeroportos.adicionar(a3);
		gAeroportos.adicionar(a4);

		Aeronave aN1 = new Aeronave("01", "Uma descrição", 100);
		Aeronave aN2 = new Aeronave("02", "Uma descrição", 150);

		gAeronaves.adicionar(aN1);
		gAeronaves.adicionar(aN2);

		Rota r1 = new Rota(c1, a1, a4, aN1);
		Rota r2 = new Rota(c2, a2, a3, aN1);
		Rota r3 = new Rota(c3, a3, a1, aN1);
		Rota r4 = new Rota(c4, a4, a2, aN1);
		Rota r5 = new Rota(c2, a4, a3, aN1);
		Rota r6 = new Rota(c1, a1, a2, aN1);

		gRotas.adicionar(r1);
		gRotas.adicionar(r2);
		gRotas.adicionar(r3);
		gRotas.adicionar(r4);
		gRotas.adicionar(r5);
		gRotas.adicionar(r6);

		ArrayList<Rota> c = new ArrayList<>();
		c.add(r1);
		c.add(r2);

		VooDireto vd1 = new VooDireto(LocalDateTime.of(2019, 8, 15, 15, 30), r1);
		VooEscalas ve1 = new VooEscalas(c, LocalDateTime.of(2019, 8, 15, 15, 30));
		gVoo.adicionar(vd1);
		gVoo.adicionar(ve1);

		gVoo.ordenaDataHora();

		System.out.println(gVoo.toString());

		gVoo.ordenaDataHoraDuracao();



	}
}
