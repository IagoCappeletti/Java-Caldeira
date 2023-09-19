package entities;

public class Carro extends Veiculo{
    @Override
    public void calcularCustoViagem(int distancia) {
        double custo =  distancia * 0.20;
        System.out.printf("\nO custo total do carro foi de %.2f", custo);
    }

    @Override
    public void imprimirDados(String marca, String modelo, int ano) {
        System.out.printf("\nCarro da marca %s e modelo %s do ano %d",marca, modelo, ano);
    }
}
