/**
 * ClienteFisico
 */
public class ClienteFisico extends Cliente {

    private String cpf;

    public ClienteFisico(String nome, String contato, String cpf) {
        super(nome, contato);
        this.isJuridico = false;
        this.cpf = cpf;
    }
}
