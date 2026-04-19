package com.unifsa.simulacaoveiculos;

public class Caminhao extends Veiculo{
    private double cargaMax;

    public Caminhao(String marca, String modelo, String placa, double cargaMax) {
        super(marca, modelo, placa);
        this.cargaMax = cargaMax;
    }

    @Override
    public void acelerar() { 
        setVelocidade(getVelocidade() + 5); 
    }

    @Override
    public double calcularConsumo() { 
        return 3.5; 
    } 

    @Override
    public void exibirStatus() {
        System.out.println("Caminhao: " + getModelo() + " | Carga: " + cargaMax + "t | Velocidade: " + getVelocidade() + "km/h");
    }

    public void interagir(Caminhao outro) {
        System.out.println("Caminhoes: " + this.getModelo() + " e " + outro.getModelo() + " mantendo distancia.");
    }
}
