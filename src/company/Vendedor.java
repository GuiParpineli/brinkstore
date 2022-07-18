package company;

import cliente.Cliente;
import produto.Produto;

/**
 * company.Vendedor
 */
public class Vendedor {

    private String nome;
    private String cpf;
    private String contato;

    private Empresa empresa;
    private int comissao;
    private Pedido pedido = new Pedido();

    public Vendedor(String nome, String cpf, int comissao, Empresa empresa) {
        this.nome = nome;
        this.cpf = cpf;
        this.comissao = comissao;
        this.empresa = empresa;
    }

    public void efetuarPedido(Cliente cliente) {
        pedido.setVendedor(this);
        pedido.setCliente(cliente);
    }

    public void addProduto(Produto produto) {
        this.pedido.addProduto(produto);
    }

    public String getNome() {
        return nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void desconto(Double valor) throws RuntimeException {
        if (this.pedido.getCliente().isJuridico) {
            pedido.setValorTotal(-(pedido.getValorTotal() - pedido.getValorTotal()) - (valor));
            System.out.println("Desconto Efetuado");
        } else {
            throw new RuntimeException("Nao Pode ter Desconto");
        }
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
