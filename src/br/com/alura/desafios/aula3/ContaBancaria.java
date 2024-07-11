package br.com.alura.desafios.aula3;

public class ContaBancaria {
    protected double saldo;

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
        else System.out.println("Deposito não realizado. Valor a depositar menor ou igual a zero.");
    }

    public void sacar(double valor) {
        boolean maiorQueZero = valor > 0;
        if (maiorQueZero) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                System.out.println("Saque não realizado. Saldo insuficiente!");
            }
        } else {
            System.out.println("Saque não realizado. Valor a sacar menor ou igual a zero.");
        }
    }

}


