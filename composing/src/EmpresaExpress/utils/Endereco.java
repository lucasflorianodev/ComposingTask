package EmpresaExpress.utils;

import java.util.Scanner;

public class Endereco {

    private static String rua;
    private static String numero;
    private static String complemento;
    private static String bairro;
    private static String cidade;
    private static String estado;
    private static String cep;

    public static void coletarEndereco() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rua/Av: ");
        rua = scanner.nextLine();

        System.out.print("Número: ");
        numero = scanner.nextLine();

        System.out.print("Complemento: ");
        complemento = scanner.nextLine();

        System.out.print("Bairro: ");
        bairro = scanner.nextLine();

        System.out.print("Cidade: ");
        cidade = scanner.nextLine();

        System.out.print("Estado: ");
        estado = scanner.nextLine();

        System.out.print("CEP: ");
        cep = scanner.nextLine();
    }
}