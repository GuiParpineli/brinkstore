import java.util.ArrayList;
import java.util.List;

public class Empresa {

  private String nome;

  private String cnpj;

  private List<Vendedor> vendedores = new ArrayList<>();

  private List<Cliente> clientes = new ArrayList<>();

  private List<Pedido> pedidos = new ArrayList<>();

  private List<Produto> produtos = new ArrayList<>();

  public void addProduto(Produto produto) {
    this.produtos.add(produto);
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

  public void addCliente(Cliente cliente){
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
    for(Vendedor e : this.vendedores){
      vendedorName.add(e.getNome());
    }
    return vendedorName;
  }
}
