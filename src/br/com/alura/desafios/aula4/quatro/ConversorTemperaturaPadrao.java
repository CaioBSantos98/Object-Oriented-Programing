package br.com.alura.desafios.aula4.quatro;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double tempFahrenheit = ( (double) 9 / 5 * temperatura ) + 32;
        System.out.println(temperatura + " graus celsius equivalem a " + tempFahrenheit + " graus fahrenheit.");
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        double tempCelsius = ( (double) 5 / 9 ) * (temperatura - 32);
        System.out.println(temperatura + " graus fahrenheit equivalem a " + tempCelsius + " graus celsius.");
    }
}
