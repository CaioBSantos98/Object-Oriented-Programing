package br.com.alura.desafios.aula4.dois;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área é de " + area + " m²");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = (altura * 2) + (largura * 2);
        System.out.println("O perímetro é de " + perimetro + " metros.");
    }
}
