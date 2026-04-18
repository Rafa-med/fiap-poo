package br.com.fiapride.model;

public class CarroSedan extends Carro {

    public boolean portaMalasGrande;

    public CarroSedan(String cor) {
        super(cor, "Sedan");
        this.portaMalasGrande = true;
    }
}