package PACKAGE_NAME.application;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaBancaria {

    private String name;
    private String cpf;
    private int idConta = new Random().nextInt(9999);
    private String senha;
    private String banco;
    private String endereco;
    private double saldo = 0;
    private LocalDateTime horarioAtual;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdConta() {
        return idConta;
    }

    public String getSenha() {
        return senha;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDateTime getHorarioAtual() {
        return horarioAtual;
    }

    public ContaBancaria() {
    }

    public ContaBancaria(String name, String cpf, int idConta, String senha, String banco, String endereco, double saldo, LocalDateTime horarioAtual) {
        this.name = name;
        this.cpf = cpf;
        this.idConta = idConta;
        this.senha = senha;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = horarioAtual;
    }

    public void registarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu cpf: ");
        this.cpf = sc.nextLine();
        System.out.print("Digite uma senha com mais de 6 caracteres: ");
        this.senha = sc.next();

        if (validarCPF(this.cpf) && validarSenha(this.senha)) {
            // Registrando o usuário no sistema
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("Registro inválido. Por favor, verifique suas informações.");
        }


    }

    public  void logar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu cpf: ");
        String email = sc.nextLine();
        System.out.print("Digite a sua senha: ");
        String senha = sc.nextLine();
        System.out.println();

        validaLogin(cpf, senha);
        validaRegistro(cpf, senha);
    }

    public  boolean validaLogin(String cpf, String senha) {
        if (this.cpf.equals(cpf) && this.senha.equals(senha)) {
            return true;
        } else {
            System.out.println("E-mail ou senha inválidos!!");
        }
        return false;
    }

    public boolean validaRegistro(String cpf, String senha) {
        if (this.cpf.equals(cpf)) {
            if (this.senha.equals(senha)) {
                System.out.println("Login bem-sucedido!");
                System.out.println("Bem vindo(a) ao Caldeira Bank!!");
                return true;
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.println("Usuário não cadastrado!");
        }
        return false;
    }


    public static boolean validarCPF(String cpf) {
        return Pattern.matches("\\d{3}\\d{3}\\d{3}\\d{2}", cpf);
    }

    public static boolean validarSenha(String senha) {
        return senha.length() >= 6;
    }





    public void fazerDeposito() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo atual: R$ " + String.format("%.1f", saldo));
        System.out.print("Digite o valor do deposito: R$ ");
        double valorDeposito = sc.nextDouble();

        if (valorDeposito <= 0) {
            System.out.println("Valor inválido!");
        } else {
            saldo = valorDeposito;
            System.out.println("Depósitos realizado com sucesso.");
            System.out.printf("Saldo atual: R$ %.2f", saldo);
            System.out.println();
        }

    }

    public void fazerSaque() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo atual: R$ " + String.format("%.1f", saldo));
        System.out.println();

    }

}
