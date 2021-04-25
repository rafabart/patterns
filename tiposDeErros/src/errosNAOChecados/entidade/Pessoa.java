package errosNAOChecados.entidade;

import errosNAOChecados.exception.IdInvalidoException;

public class Pessoa {

    private int id;
    private String nome;

    //throws -> Significa(Informação) que o método PODE disparar uma exceção
    public Pessoa(int id, String nome) throws IdInvalidoException {

        //throw -> Despara(Ação) uma ação.
        if (id < 0) throw new IdInvalidoException();

        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
