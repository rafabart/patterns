package Singleton;

public class Principal {
    public static void main(String[] args) {

/*        O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista
          e forneça um único ponto de acesso a ele para qualquer outro código.
*/

        Singleton singleton = Singleton.getUniqueInstance("FOO");
        Singleton anotherSingleton = Singleton.getUniqueInstance("VAA");

        //Somente FOO é exibido já que só é permitido ter uma instancia na api.
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }
}
