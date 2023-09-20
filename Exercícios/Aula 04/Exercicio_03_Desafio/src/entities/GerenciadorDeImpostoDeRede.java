package entities;

public class GerenciadorDeImpostoDeRede {

    private double totalTributos = 0;

    public void adicionar(Tributavel tributavel) {
        this.totalTributos += tributavel.calculaTributos();
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}
