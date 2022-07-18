package produto;

public class Utilidade implements Produto {

    private String nome;
    private Double valor;

    private int unidEmbalagem;

    public Utilidade(String nome, Double valor, int unidEmbalagem) {
        this.nome = nome;
        this.valor = valor;
        this.unidEmbalagem = unidEmbalagem;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

}
