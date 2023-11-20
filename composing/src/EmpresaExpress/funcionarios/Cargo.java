package EmpresaExpress.funcionarios;

import EmpresaExpress.utils.Pessoa;

import java.util.Scanner;

public class Cargo {

    static String CargoInterno;

    public static void funcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando processo cadastramento de EmpresaExpress.cliente");
        System.out.println("||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||");
        System.out.println("\n==============================================");
        System.out.println("SISTEMA DE CADASTRAMENTO DE FUNCIONÁRIOS");
        System.out.println("==============================================");
        System.out.println("\nPor favor, informe as seguintes informações:");


        // solicita o cargo
        System.out.print("Digite seu Cargo:");
        CargoInterno = scanner.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.coletardados();
    }
}