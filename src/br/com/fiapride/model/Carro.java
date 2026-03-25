package br.com.fiapride.model;

public class Carro {

    public String cor;
    public String carroceria;

    public Carro(String cor, String carroceria) {
        this.cor = cor;
        this.carroceria = carroceria;
    }

    // Método 1
    public void alterarCor(String novaCor) {
        if (novaCor.equals("")) {
            System.out.println("Cor inválida.");
        } else {
            cor = novaCor;
        }
    }

    // Método 2
    public void alterarCarroceria(String novaCarroceria) {
        if (novaCarroceria.equals("")) {
            System.out.println("Carroceria inválida.");
        } else {
            carroceria = novaCarroceria;
        }
    }
}
