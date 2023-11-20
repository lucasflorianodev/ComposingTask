package EmpresaExpress.utils;

import java.util.Scanner;

public class Telefone {

    static String TelefoneCelular;

    public static void TelefoneCelular() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu telefone ou celular (no formato (00)90000-0000):");
        TelefoneCelular = scanner.nextLine();
        while (!TelefoneCelular.matches("^\\(\\d{2}\\)\\d{5}-\\d{4}$")) {
            System.out.print("Por favor, digite o telefone ou celular no formato correto:");
            TelefoneCelular = scanner.nextLine();
        }
        Endereco endereco = new Endereco();
        Endereco.coletarEndereco();
    }
}