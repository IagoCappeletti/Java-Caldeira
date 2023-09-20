package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.GerenciadorDeImpostoDeRede;
import entities.SeguroDeVIda;

public class TestaTributavel {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVIda seguro = new SeguroDeVIda();

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        System.out.println("Tributos a pagar: " + contaCorrente.calculaTributos());
        contaCorrente.obterSaldo();

        System.out.println();
        contaPoupanca.depositar(520);
        contaPoupanca.sacar(10);
        System.out.println("Tributos a pagar: " + contaPoupanca.calculaTributos());
        contaPoupanca.obterSaldo();

        seguro.calculaTributos();
        GerenciadorDeImpostoDeRede gerenciadorDeImpostoDeRede = new GerenciadorDeImpostoDeRede();
        gerenciadorDeImpostoDeRede.adicionar(contaCorrente);
        gerenciadorDeImpostoDeRede.adicionar(seguro);
        System.out.println("Total a pagar de atributos: " + gerenciadorDeImpostoDeRede.getTotalTributos());
    }
}
