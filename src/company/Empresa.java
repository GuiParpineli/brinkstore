package company;

import cliente.Cliente;
import produto.Produto;
import produto.Utilidade;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;

    private String cnpj;

    private List<Vendedor> vendedores = new ArrayList<>();

    private List<Cliente> clientes = new ArrayList<>();

    private List<Pedido> pedidos = new ArrayList<>();

    private List<Produto> produtos = new ArrayList<>();

    public void addProdUtilidade() {
        String name =  JOptionPane.showInputDialog("Nome do Produto");
        Double valor = Double.valueOf(JOptionPane.showInputDialog("Valor do Produto"));
        int undEmbalagem = Integer.parseInt(JOptionPane.showInputDialog("Quantos por kit"));

        Utilidade utilidade = new Utilidade(name, valor, undEmbalagem);

        this.getProdutos().add(utilidade);
    }

    public void addVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public List getPedidos() {
        return pedidos;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<String> getVendedores() {
        List<String> vendedorName = new ArrayList<>();
        for (Vendedor e : this.vendedores) {
            vendedorName.add(e.getNome());
        }
        return vendedorName;
    }
}
