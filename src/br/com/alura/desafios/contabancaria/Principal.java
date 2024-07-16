package br.com.alura.desafios.contabancaria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var listaContas = new ArrayList<ContaBancaria>();
        listaContas.add(new ContaBancaria(10002024,600));
        listaContas.add(new ContaBancaria(20002024,1000));
        listaContas.add(new ContaBancaria(30002024,5000));
        listaContas.add(new ContaBancaria(40002024,350));
        listaContas.add(new ContaBancaria(50002024,5000));

        ContaBancaria maiorSaldo = listaContas.get(0);

        for (int i = 0; i < listaContas.size(); i++) {
            if (listaContas.get(i).getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = listaContas.get(i);
            }
        }

        System.out.println(maiorSaldo);
        System.out.println("Saldo: " + maiorSaldo.getSaldo());
    }
}
