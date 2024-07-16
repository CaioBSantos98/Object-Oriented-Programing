package br.com.alura.desafios.compras;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limiteCartao = leitor.nextDouble();
        leitor.nextLine();

        List compras = new ArrayList<Compra>();

        boolean encerrar = false;
        while (!encerrar) {
            System.out.println("Digite a descrição da compra: ");
            String descricaoCompra = leitor.nextLine();
            System.out.println("Digite o valor da compra: ");
            double valorCompra = leitor.nextDouble();
            leitor.nextLine();

            if (valorCompra <= limiteCartao) {
                compras.add(new Compra(descricaoCompra, valorCompra));
                limiteCartao -= valorCompra;
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Limite insuficiente para essa compra. ");
                System.out.println("Limite atual do cartao: " + limiteCartao);
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            int codigoMenu = leitor.nextInt();
            leitor.nextLine();
            if (codigoMenu == 0) {
                break;
            }
        }

        System.out.println(compras);
        //Collections.sort(compras);
        compras.sort(Comparator.comparing(Compra::getPreco));
        System.out.println(compras);

    }
}
