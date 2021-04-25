package errosChecados.exception;

// Erro É checado
public class IdInvalidoException extends Exception {

    public IdInvalidoException() {
        super("Id não encontrado");
    }
}
