package br.com.alura.desafios.interfaceforma;

public class Quadrado implements Forma{
    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea() {
        this.area = lado * lado;
    }

    @Override
    public String toString() {
        return "Lado do quadrado: " + this.lado;
    }
}
