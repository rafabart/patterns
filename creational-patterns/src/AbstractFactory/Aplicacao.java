package AbstractFactory;

public class Aplicacao {

    private Botao botao;
    private Janela janela;

    public Aplicacao(GUIFactory guiFactory) {
        botao = guiFactory.criaBotao();
        janela = guiFactory.criaJanela();
    }

    public void exibir() {
        System.out.println(botao.getBotao());
        System.out.println(janela.getJanela());
    }
}
