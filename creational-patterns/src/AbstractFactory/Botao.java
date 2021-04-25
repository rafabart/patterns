package AbstractFactory;

public interface Botao {

    String getBotao();
}





class WindowsBotao implements Botao {

    @Override
    public String getBotao() {
        return "Windows Botão";
    }
}


class MacBotao implements Botao {

    @Override
    public String getBotao() {
        return "MAC Botão";
    }
}
