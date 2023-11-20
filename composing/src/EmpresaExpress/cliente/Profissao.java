package EmpresaExpress.cliente;

import EmpresaExpress.utils.Pessoa;

import java.util.Scanner;

public class Profissao {

    static String ocupacaoProfissional;

    public static void ocupacao(){
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando processo cadastramento de cliente");
        System.out.println("||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||");
        System.out.println("\n==============================================");
        System.out.println("SISTEMA DE CADASTRAMENTO DE CLIENTES");
        System.out.println("==============================================");
        System.out.println("\nPor favor, informe as seguintes informações:");


        // solicita a ocupação profissional
        System.out.print("Digite sua ocupação profissional:");
        ocupacaoProfissional = scanner.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.coletardados();
    }
}