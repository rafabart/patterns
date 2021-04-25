package FactoryMethod;

public class MoedaFactory {


    public static Moeda criarMoeda(Pais pais) {

        if (pais.equals(Pais.BRASIL)) {
            return new Real();
        }

        if (pais.equals(Pais.EUA)) {
            return new Dolar();
        }

        throw new IllegalArgumentException("Não existe esse pais");
    }
}


enum Pais {
    BRASIL, EUA
}
