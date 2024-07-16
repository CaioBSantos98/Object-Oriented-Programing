package br.com.alura.desafios.usandoinstanceof;

public class Principal {
    public static void main(String[] args) {
        var luna = new Cachorro("Mamífero", "Luna");
        if (luna instanceof Animal) {
            var teste = (Animal) luna;
            System.out.println(teste.getClass());
        }
    }
}
