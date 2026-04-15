package br.com.fiapride.model;

public class Viagem {

    // Atributos simples
    private String destino;
    private double valor;

    // Associação (o coração do exercício)
    private Passageiro solicitante;
    private Carro veiculoUtilizado;

    // Construtor
    public Viagem(String destino, Passageiro solicitante, Carro veiculoUtilizado) {
        this.destino = destino;
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.valor = 0.0;

        System.out.println("Nova viagem criada para: " + destino);
    }

    // Método principal
    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA VIAGEM ---");
        System.out.println("Destino: " + destino);
        System.out.println("Passageiro: " + solicitante.nome);
        System.out.println("Veículo: " + veiculoUtilizado.carroceria + " - " + veiculoUtilizado.cor);
        System.out.println("------------------------\n");
    }

    // Getters
    public String getDestino() {
        return destino;
    }

    public Passageiro getSolicitante() {
        return solicitante;
    }

    public Carro getVeiculoUtilizado() {
        return veiculoUtilizado;
    }
}