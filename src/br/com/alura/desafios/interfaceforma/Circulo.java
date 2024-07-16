package br.com.alura.desafios.interfaceforma;

public class Circulo implements Forma{
    private double pi = 3.14;
    private double raio;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.area = pi * (raio * raio);
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Raio do circulo: " + this.raio;
    }
}
