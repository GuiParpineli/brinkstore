import java.util.ArrayList;
import java.util.List;

/**
 * Pedido
 */
public class Pedido {

    private Vendedor vendedor;
    private Cliente cliente;

    private Double valorTotal = 0.0;
    private List<Produto> produtos = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setValorTotal(Double valor) {
        this.produtos.forEach(price -> price.setValor(0.0));
        this.valorTotal = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double getValorTotal() {
        for (Produto e : this.produtos) {
            this.valorTotal += e.getValor();
        }
        return valorTotal;
    }

    public List getProdutos() {
        List<String> produtosnome = new ArrayList<>();
        for (Produto e : this.produtos) {
            produtosnome.add(e.getNome());
        }
        System.out.println(this.vendedor.getNome() + " , seu pedido contem os seguintes itens :");
        return produtosnome;
    }

    public void setProdutos(List produtos) {
        this.produtos = produtos;
    }

}
