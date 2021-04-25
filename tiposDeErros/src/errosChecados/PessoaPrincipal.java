package errosChecados;

import errosChecados.entidade.Pessoa;
import errosChecados.exception.IdInvalidoException;

public class PessoaPrincipal {
    public static void main(String[] args) {

        // Obriga a fazer o tratamento do erro no código.

        try {
            Pessoa pessoa = new Pessoa(-1, "Bart");
        } catch (IdInvalidoException e) {

            //Exibe a messagem personalizada
            System.out.println(e.getMessage());
            //Exibe a pilha de execução dos erros e onde ecorreu
            e.printStackTrace();
        }
    }
}
