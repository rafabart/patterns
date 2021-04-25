package FactoryMethod;

public class Principal {
    public static void main(String[] args) {
        /*
         * O Factory method é um padrão de projeto criacional, que resolve o problema de criar objetos sem especificar suas classes concretas.
         * O Factory Method define um método, que deve ser usado para criar objetos em vez da chamada direta ao construtor (operador new).
         * As subclasses podem substituir esse método para alterar a classe de objetos que serão criados.
         */

        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);

        System.out.printf(moeda.getSimbolo());

    }
}
