package br.com.alura.desafios.aula4.um;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        double cotacaoDolar = 6.00;
        double valorEmReal = valorEmDolar * cotacaoDolar;
        System.out.println("O valor em reais é: " + valorEmReal);
    }
}
