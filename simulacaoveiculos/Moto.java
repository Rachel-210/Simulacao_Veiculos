package com.unifsa.simulacaoveiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, String placa, int cilindradas) {
        super(marca, modelo, placa);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() { 
        setVelocidade(getVelocidade() + 15); 
    }

    @Override
    public double calcularConsumo() { 
        return 28.0; 
    }

    @Override
    public void exibirStatus() {
        System.out.println("Moto: " + getModelo() + " | " + cilindradas + "cc | Velocidade: " + getVelocidade() + "km/h");
    }
}