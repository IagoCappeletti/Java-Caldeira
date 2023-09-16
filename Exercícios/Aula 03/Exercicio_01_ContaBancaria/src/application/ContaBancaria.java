package PACKAGE_NAME.application;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaBancaria {

    private String name;
    private String cpf;
    private String conta = String.valueOf(new Random().nextInt(9999));
    private int idConta = new Random().nextInt(10);
    private String senha;
    private String banco = "Caldeira Bank";
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

    public String getConta() {
        return conta;
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

    public ContaBancaria(String name, String cpf, String conta, int idConta, String senha, String banco, String endereco, double saldo, LocalDateTime horarioAtual) {
        this.name = name;
        this.cpf = cpf;
        this.conta = conta;
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

    public void logar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu cpf: ");
        String email = sc.nextLine();
        System.out.print("Digite a sua senha: ");
        String senha = sc.nextLine();
        System.out.println();

        if (validaLogin(cpf, senha) && validaRegistro(cpf, senha)) {
            logado();
        }
    }

    public boolean validaLogin(String cpf, String senha) {
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

    public void logado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBanco: " + getBanco() + "\nconta: " + getConta() + " - " + getIdConta() + "\nSaldo: R$ " + getSaldo());
        System.out.println("#1 - Fazer um depósito");
        System.out.println("#2 - Fazer um saque");
        System.out.println("#3 - Fazer uma transferência");
        System.out.println("#4 - Fazer um pix");
        System.out.println("#5 - Ver a hora atual");
        System.out.println("#6 - Ver informações");
        System.out.println("#7 - Alterar cadastro");
        System.out.println("#8 - Excluir usuário");
        System.out.println("#9 - Sair");
        System.out.println("==========================");
        System.out.print("Qual opção você deseja acessar? ");
        int opcao = sc.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                fazerDeposito();
                break;
            case 2:
                fazerSaque();
                break;
            case 3:
//                fazerTransferencia();
                break;
            case 4:
//
                break;
            case 5:
//                alterarCadastro();
                break;
            case 6:
//                excluirUsuario();
                break;
            case 7:
                System.out.println("Retornando a página de login!!");
                return;
            default:
                System.out.println("Opção inválida!");
        }
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
        logado();
    }

    public void fazerSaque() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo atual: R$ " + String.format("%.1f", saldo));
        System.out.print("Digite o valor do saque: R$ ");
        double valorSaque = sc.nextDouble();

        if (valorSaque <= 0) {
            System.out.println("Valor inválido!\n");
        } else if (valorSaque > saldo) {
            System.out.println("O valor selecionado é maior que o saldo disponível!\\n");
        } else {
            double novoSaldo = saldo - valorSaque;
            saldo = novoSaldo;

            System.out.println("Novo saldo disponível: R$ " + String.format("%.2f", saldo));
            System.out.println();
        }
        logado();
    }

}
