package produto;

public class Brinquedo implements  Produto{
    private String nome;
    private Double valor;

    private boolean haveImetro;


    public Brinquedo(String nome, Double valor, boolean haveImetro) {
        this.nome = nome;
        this.valor = valor;
        this.haveImetro = haveImetro;
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
