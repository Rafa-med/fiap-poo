package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

	public static void main(String[] args){

		// Passageiro 1
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;

		// Carro 1
		Carro prisma = new Carro("preto", "Sedan");

		// Passageiro 2
		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Carlos Souza";
		passageiro2.saldo = 12.50;

		// Carro 2
		Carro byd = new Carro("branco", "SUV");

		// =============================
		// 🔥 AQUI É O EXERCÍCIO NOVO
		// =============================

		Viagem viagem1 = new Viagem("Avenida Paulista", passageiro1, prisma);
		Viagem viagem2 = new Viagem("Shopping Center", passageiro2, byd);

		// Testando
		viagem1.exibirResumo();
		viagem2.exibirResumo();
	}
}