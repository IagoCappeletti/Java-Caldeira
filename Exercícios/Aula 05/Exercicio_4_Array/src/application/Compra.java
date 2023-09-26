package application;

public class Compra {

    private String nome;
    private int quantidade;
    private String dataValidade;

    public Compra(String nome, int quantidade,String dataValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Compras = nome: " + nome + ", quantidade: " + quantidade + ", dataValidade: " + dataValidade;
    }
}
