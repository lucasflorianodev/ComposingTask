package EmpresaExpress.base;

import java.util.Scanner;

import static EmpresaExpress.cliente.Cliente.imprimirDadosCliente;
import static EmpresaExpress.cliente.Profissao.ocupacao;
import static EmpresaExpress.funcionarios.Cargo.funcao;
import static EmpresaExpress.funcionarios.Funcionario.imprimirDadosFuncionario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===============================");
        System.out.println(" SISTEMA DE CADASTRO INTERNO");
        System.out.println("===============================");
        System.out.println("Bem-vindo ao sistema de cadastro interno");

        int opcao = 0;
        while (opcao != 1 && opcao != 2) {
            System.out.println("\nPor favor, selecione uma opção:");
            System.out.println("1 - Efetuar Novo Cadastramento");
            System.out.println("2 - Visualizar Cadastramento Registrados");
            System.out.print("Opção: ");
            String entrada = scanner.nextLine();

            try {
                opcao = Integer.parseInt(entrada);
                if (opcao == 1) {
                    novocadastro();
                } else if (opcao == 2) {
                    visualizarcadastros();
                } else {
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    System.out.print("Opção: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, tente novamente.");
                System.out.print("Opção: ");
            }
        }
    }

    public static void novocadastro() {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n===============================");
            System.out.println(" SISTEMA DE CADASTRO INTERNO");
            System.out.println("===============================");
            System.out.println("\nSelecione uma opção para um novo cadastro:");
            System.out.println("1 - Cliente");
            System.out.println("2 - Funcionário");
            System.out.println("0 - Voltar ao menu anterior");
            System.out.print("Opção: ");

            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) { // verifica se o próximo valor não é um número inteiro
                System.out.println("Opção inválida, tente novamente.");
                scanner.nextLine(); // consome a entrada inválida
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> ocupacao();
                case 2 -> funcao();
                case 0 -> sair = true;
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static void visualizarcadastros() {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n===============================");
            System.out.println(" SISTEMA DE CADASTRO INTERNO");
            System.out.println("===============================");
            System.out.println("\nSelecione uma opção para visualizar cadastros:");
            System.out.println("1 - Cliente");
            System.out.println("2 - Funcionário");
            System.out.println("0 - Voltar ao menu anterior");
            System.out.print("Opção: ");

            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) { // verifica se o próximo valor não é um número inteiro
                System.out.println("Opção inválida, tente novamente.");
                scanner.nextLine(); // consome a entrada inválida
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> imprimirDadosCliente();
                case 2 -> imprimirDadosFuncionario();
                case 0 -> sair = true;
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}