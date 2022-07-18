/**
 * Produto
 */
public class Produto {

    private String nome;
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
