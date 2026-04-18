package br.com.fiapride.model;

public class CarroSUV extends Carro {

    public boolean tracao4x4;

    public CarroSUV(String cor) {
        super(cor, "SUV");
        this.tracao4x4 = true;
    }
}