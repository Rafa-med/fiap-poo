package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Viagem;

// 👇 IMPORTS NOVOS (IMPORTANTÍSSIMO)
import br.com.fiapride.model.CarroSUV;
import br.com.fiapride.model.CarroSedan;

public class SistemaPrincipal {

	public static void main(String[] args){

		// Passageiro 1
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;

		// 👇 AGORA USA HERANÇA
		Carro prisma = new CarroSedan("preto");

		// Passageiro 2
		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Carlos Souza";
		passageiro2.saldo = 12.50;

		// 👇 AGORA USA HERANÇA
		Carro byd = new CarroSUV("branco");

		// =============================
		// 🔥 EXERCÍCIO
		// =============================

		Viagem viagem1 = new Viagem("Avenida Paulista", passageiro1, prisma);
		Viagem viagem2 = new Viagem("Shopping Center", passageiro2, byd);

		// Testando
		viagem1.exibirResumo();
		viagem2.exibirResumo();
	}
}