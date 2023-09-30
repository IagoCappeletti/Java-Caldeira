package entities;

public class Contatos {

    private String numeroDeTelefone;
    private String nome;
    private String endereco;
    private String localidade;

    public Contatos(String numeroDeTelefone, String nome, String endereco, String localidade) {
        this.numeroDeTelefone = numeroDeTelefone;
        this.nome = nome;
        this.endereco = endereco;
        this.localidade = localidade;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Telefone: " + numeroDeTelefone + ", nome: " + nome + ", endereco: " + endereco + ", localidade: " + localidade;
    }
}
