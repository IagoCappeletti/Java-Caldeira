package entities;

public class ContaBancaria {

    private double saldo = 300;

    public void sacar(double valor){
        try {
            if (this.saldo > valor) {
                this.saldo -= valor;
                System.out.println("Saque feito com sucesso!");
            } else {
                throw new SaldoInsuficienteException("Saldo insuficiente na conta!");
            }

        }catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e);
            /*Se usar o e.getMessage() aparecera só a mensagem*/
        }
    }
}
