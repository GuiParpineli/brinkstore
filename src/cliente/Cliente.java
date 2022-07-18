package cliente;

/**
 * cliente.Cliente
 */
public abstract class Cliente {

    private String nome;
    private String contato;

    public Boolean isJuridico;


    public Cliente(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
        this.isJuridico = true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
