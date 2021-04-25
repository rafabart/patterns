package Singleton;

public final class Singleton {

    private static Singleton uniqueInstance;
    private String value;


    //Construtor privado
    private Singleton(final String value) {
        this.value = value;
    }


    //método get público
    public static synchronized Singleton getUniqueInstance(final String valeu) {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton(valeu);
        }
        return uniqueInstance;
    }

    public String getValue() {
        return this.value;
    }
}
