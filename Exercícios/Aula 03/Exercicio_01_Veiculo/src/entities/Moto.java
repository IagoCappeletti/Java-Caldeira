package entities;

public class Moto extends Veiculo{

    @Override
    public void calcularCustoViagem(int distancia) {
        double custo = distancia * 0.15;
        System.out.printf("\nO custo total da moto foi de %.2f", custo);
    }

    @Override
    public void imprimirDados(String marca, String modelo, int ano) {
        System.out.printf("\nMoto da marca %s e modelo %s do ano %d", marca, modelo, ano);
    }
}
