package entities;

public class ContaPoupanca extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return 0;
    }
}
