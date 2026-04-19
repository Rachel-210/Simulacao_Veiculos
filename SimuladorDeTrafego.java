package com.unifsa.simulacaoveiculos;

import java.util.ArrayList;
import java.util.List;

public class SimuladorDeTrafego {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void registrarEntrada(Veiculo v) {
        if (veiculos.contains(v)) {
            System.out.println("ACESSO NEGADO: Veiculo com placa " + v.getPlaca() + " ja esta na pista.");
        } else {
            veiculos.add(v);
            System.out.println("ENTRADA: " + v.getModelo() + " liberado.");
        }
    }

    public void iniciarSimulacao() {
        System.out.println("\n--- SIMULACAO ---");
        for (Veiculo v : veiculos) {
            v.acelerar();
            v.exibirStatus();
        }
    }
}
