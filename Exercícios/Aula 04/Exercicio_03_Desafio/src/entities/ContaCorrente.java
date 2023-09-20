package entities;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return saldo * 00.1;
    }
}
