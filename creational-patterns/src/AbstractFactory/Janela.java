package AbstractFactory;

public interface Janela {
    String getJanela();
}





class WindowsJanela implements Janela {

    @Override
    public String getJanela() {
        return "Windows Janela";
    }
}


class MacJanela implements Janela {

    @Override
    public String getJanela() {
        return "MAC Janela";
    }
}
