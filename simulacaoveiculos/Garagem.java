package com.unifsa.simulacaoveiculos;

public class Garagem {
    private Veiculo[] vagas;
    private int contador;

    public Garagem(int capacidade) {
        this.vagas = new Veiculo[capacidade];
        this.contador = 0;
    }

    public void estacionar(Carro c) {
        System.out.println("\n>>> Preparando vaga para o carro: " + c.getModelo());
        adicionarVeiculo(c);
    }

    public void estacionar(Moto m) {
        System.out.println("\n>>> Preparando vaga especial para a moto: " + m.getModelo());
        adicionarVeiculo(m);
    }

    public void estacionar(Veiculo v) {
        System.out.println("\n>>> Estacionando veiculo generico: " + v.getModelo());
        adicionarVeiculo(v);
    }

    private void adicionarVeiculo(Veiculo v) {
        if (contador < vagas.length) {
            vagas[contador] = v;
            contador++;
            System.out.println("Confirmado: " + v.getModelo() + " guardado na vaga " + contador);
        } else {
            System.out.println("ERRO: Garagem lotada! Nao foi possivel guardar o " + v.getModelo());
        }
    }

    public void exibirEstoque() {
        System.out.println("\n=== RELATORIO DA GARAGEM ===");
        for (int i = 0; i < contador; i++) {
            vagas[i].exibirStatus();
        }
        System.out.println("============================\n");
    }
}