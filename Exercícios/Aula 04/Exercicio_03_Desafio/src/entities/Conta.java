package entities;

public class Conta {

    protected double saldo;

    public void depositar(double valorDeposito) {
       if (valorDeposito < 0 ){
           System.out.println("Valor inválido!");
       } else {
           this.saldo += valorDeposito;
       }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= saldo) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void obterSaldo() {
        System.out.printf("Saldo dísponivel em conta: R$ %.2f\n", saldo);
    }

}
