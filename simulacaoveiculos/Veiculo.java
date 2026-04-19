package com.unifsa.simulacaoveiculos;

import java.util.Objects;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int velocidade;
    private double nivelCombustivel;

    public Veiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = 0;
        this.nivelCombustivel = 10.0;
    }

    public void abastecer(double litros) {
        System.out.println(modelo + " abastecido com " + litros + "L de gasolina comum.");
    }

    public void abastecer(double litros, String tipo) {
        System.out.println(modelo + " abastecido com " + litros + "L de " + tipo + ".");
    }

    public void ligar() { 
        System.out.println(modelo + " ligado."); 
    }
    
    public void tentarAcelerar() {
        if (nivelCombustivel > 0) {
            acelerar(); 
            nivelCombustivel -= (calcularConsumo() / 10);
            System.out.println(modelo + " acelerou! Velocidade: " + velocidade + "km/h.");
        } else {
            System.out.println("ERRO: " + modelo + " não pode acelerar. Tanque vazio!");
        }
    }
    
    public abstract void acelerar(); 
    public abstract double calcularConsumo();
    public abstract void exibirStatus();

    public void interagir(Veiculo outro) {
        System.out.println(this.modelo + " buzinou para " + outro.getModelo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() { 
        return Objects.hash(placa); 
    }

    @Override
    public String toString() {
        return "Veiculo: " + marca + " " + modelo + " [Placa: " + placa + "]";
    }

    public String getMarca() { 
        return marca; 
    }
    
    public String getModelo() { 
        return modelo; 
    }
    
    public String getPlaca() { 
        return placa; 
    }
    
    public int getVelocidade() { 
        return velocidade; 
    }
    
    public void setVelocidade(int velocidade) { 
        this.velocidade = velocidade; 
    }
}
