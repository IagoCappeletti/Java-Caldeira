package PACKAGE_NAME.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaBancaria {

    private String nome;
    private String cpf;
    private String conta;
    private String idConta;
    private String senha;
    private String banco = "Caldeira Bank";
    private String endereco;
    private double saldo = 0;
    private LocalDateTime horarioAtual = LocalDateTime.now();
    private List<String> historicoTransacoes = new ArrayList<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public String getConta() {
        return conta;
    }

    public String getIdConta() {
        return idConta;
    }

    public String getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDateTime getHorarioAtual() {
        return horarioAtual;
    }

    public ContaBancaria() {
    }

    public ContaBancaria(String name, String cpf, String conta, String idConta, String senha, String banco, String endereco, double saldo, LocalDateTime horarioAtual) {
        this.nome = name;
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
        this.nome = sc.nextLine();
        System.out.print("Digite o seu cpf: ");
        this.cpf = sc.nextLine();
        System.out.print("Digite o seu endereço: ");
        this.endereco = sc.nextLine();
        System.out.print("Digite uma senha com o minino de 6 caracteres: ");
        this.senha = sc.next();

        if (validarCPF(this.cpf) && validarSenha(this.senha)) {
            this.conta = gerarNumeroContaAleatorio();
            this.idConta = gerarIdContaAleatorio();
            // Registrando o usuário no sistema
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("Registro inválido. Por favor, verifique suas informações.");
        }


    }

    private String gerarNumeroContaAleatorio() {
        return String.valueOf(new Random().nextInt(9999));
    }

    private String gerarIdContaAleatorio() {
        return String.valueOf(new Random().nextInt(10));
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

        System.out.println("\nMenu " + getBanco());
        System.out.println("conta: " + getConta() + " - " + getIdConta() + "\nSaldo: R$ " + getSaldo());
        System.out.println("#1 - Fazer um depósito");
        System.out.println("#2 - Fazer um saque");
        System.out.println("#3 - Fazer um pix");
        System.out.println("#4 - Fazer uma transferência");
        System.out.println("#5 - Ver saldo atual");
        System.out.println("#6 - Ver a hora atual");
        System.out.println("#7 - Ver informações");
        System.out.println("#8 - Histórico de transações");
        System.out.println("#9 - Alterar cadastro");
        System.out.println("#10 - Excluir usuário");
        System.out.println("#11 - Sair");
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
                transferenciaPix();
                break;
            case 4:
                transferenciaNormal();
                break;
            case 5:
                verificaSaldo();
                break;
            case 6:
                verificaHora();
                break;
            case 7:
                verInformacao();
                break;
            case 8:
                historicoTransacoes();
                break;
            case 9:
                alterarEndereco();
                break;
            case 10:
                excluirUsuario();
                break;
            case 11:
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
            registrarTransacao("Depósito: +" + valorDeposito);
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
            registrarTransacao("Saque: -" + valorSaque);
            System.out.println();
        }
        logado();
    }

    public void transferenciaPix() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Saldo atual: R$ " + String.format("%.1f", saldo));
        System.out.print("Qual valor você deseja transferir? ");
        double valorTransferenciaPix = sc.nextDouble();
        System.out.print("Digete a chave pix: ");
        sc.nextLine();
        String destinoPix = sc.nextLine().toLowerCase();

        if (valorTransferenciaPix <= 0) {
            System.out.println("Valor inválido!\n");
        } else if (valorTransferenciaPix > saldo) {
            System.out.println("O valor selecionado é maior que o saldo disponível!\\n");
        } else {
            double novoSaldo = saldo - valorTransferenciaPix;
            saldo = novoSaldo;

            System.out.printf("Pix do valor %.2f realizado com sucesso! para: %s\nRealizado na data " + dtf.format(horarioAtual), valorTransferenciaPix, destinoPix);
            System.out.println("\nNovo saldo disponível: R$ " + String.format("%.2f", saldo));
            registrarTransacao("Transferência PIX: -" + valorTransferenciaPix + " para " + destinoPix);
        }
        logado();
    }

    public void transferenciaNormal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo atual: R$ " + String.format("%.1f", saldo));
        System.out.print("Qual valor você deseja transferir? ");
        double valorTransferencia = sc.nextDouble();
        System.out.print("Digite a conta para qual deseja enviar o valor: ");
        sc.nextLine();
        String destinoTransferencia = sc.nextLine().toLowerCase();

        if (saldo <= 0) {
            System.out.printf("Você não tem saldo suficiente para essa transferência. Saldo disponível: %.2f", saldo);
        } else if (valorTransferencia > saldo) {
            System.out.println("O valor selecionado é maior que o saldo disponível!");
        } else if (valorTransferencia <= 0) {
            System.out.println("Valor inválido, tente novamente!");
        } else {
            double novoSaldo = saldo - valorTransferencia;
            saldo = novoSaldo;

            System.out.printf("Transferencia realizada com sucesso! para %s \nRealizado na data " + dtf.format(horarioAtual), destinoTransferencia);
            registrarTransacao("Transferência Normal: -"+ valorTransferencia + " para " + destinoTransferencia);
            System.out.println();
        }
        logado();
    }

    public void verificaSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
        logado();
    }

    public void verificaHora() {
        System.out.println("Hora atual: " + horarioAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        logado();
    }

    public void verInformacao() {
        System.out.printf("Nome: %s, CPF: %s, Endereço: %s\nBanco: %s Conta: %s-%s, saldo: %.2f\n", nome, cpf, endereco, banco, conta, idConta, saldo);
        logado();
    }

    private void registrarTransacao(String descricao) {
        historicoTransacoes.add(dtf.format(horarioAtual) + " - " + descricao);
    }

    public void historicoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
        logado();
    }

    public void alterarEndereco() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o novo endereço: ");
        String novoEndereco = sc.nextLine();
        if (novoEndereco != null && !novoEndereco.isEmpty()) {
            endereco = novoEndereco;
            System.out.println("Endereço atualizado com sucesso para: " + novoEndereco);
        } else {
            System.out.println("Endereço inválido. O endereço não foi atualizado.");
        }
        logado();
    }

    public void excluirUsuario() {

        nome = "";
        cpf = "";
        conta = "";
        idConta = "";
        senha = "";
        banco = "";
        endereco = "";
        saldo = 0;

        System.out.println("Usuário deletado com sucesso!");

    }

}
