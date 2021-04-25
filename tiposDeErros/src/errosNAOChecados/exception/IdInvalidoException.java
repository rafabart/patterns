package errosNAOChecados.exception;

// Erros em tempo de execução NÃO são checados
public class IdInvalidoException extends RuntimeException {

    public IdInvalidoException() {
        super("Id não encontrado");
    }
}
