package AbstractFactory;

public interface GUIFactory {

    Botao criaBotao();

    Janela criaJanela();
}




class MacOSFactory implements GUIFactory {

    @Override
    public Botao criaBotao() {
        return new MacBotao();
    }

    @Override
    public Janela criaJanela() {
        return new MacJanela();
    }
}


class WindowsFactory implements GUIFactory {

    @Override
    public Botao criaBotao() {
        return new WindowsBotao();
    }

    @Override
    public Janela criaJanela() {
        return new WindowsJanela();
    }
}