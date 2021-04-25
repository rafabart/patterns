package AbstractFactory;

public class Principal {

    private static Aplicacao configuraAplicacao() {

        GUIFactory guiFactory;

        String escolhaDoSistema = "win";

        if (escolhaDoSistema.equals("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        return new Aplicacao(guiFactory);
    }


    public static void main(String[] args) {

        Aplicacao aplicacao = configuraAplicacao();
        aplicacao.exibir();
    }
}
