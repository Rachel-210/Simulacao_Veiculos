package com.unifsa.simulacaoveiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, String placa, int portas) {
        super(marca, modelo, placa);
        this.portas = portas;
    }

    @Override
    public void acelerar() { 
        setVelocidade(getVelocidade() + 10); 
    }

    @Override
    public double calcularConsumo() { 
        return 12.5; 
    }

    @Override
    public void exibirStatus() {
        System.out.println("Carro: " + getModelo() + " | Portas: " + portas + " | Velocidade: " + getVelocidade() + "km/h");
    }

    public void ligar(String modo) { 
        System.out.println("Carro ligado no modo " + modo); 
    }
}