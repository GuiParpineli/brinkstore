package cliente;

import cliente.Cliente;

/**
 * cliente.ClienteJuridico
 */
public class ClienteJuridico extends Cliente {

  private String cnpj;
  public ClienteJuridico(String nome, String contato, String cnpj) {
    super(nome, contato);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

}