package EmpresaExpress.utils;

import java.util.Scanner;

public class Pessoa {

    protected static String nomeCompleto;
    protected static String dataNascimento;
    protected static String email;

    public void coletardados() {
        Scanner scanner = new Scanner(System.in);

        // solicita o nome completo e valida que somente letras foram digitadas
        System.out.print("Digite seu nome completo:");
        nomeCompleto = scanner.nextLine();
        while (this.nomeCompleto.matches("^[A-Za-z\\s]+$")) {
            System.out.print("Por favor, digite somente letras: ");
            this.setnomeCompleto(scanner.nextLine());
        }

        // solicita a data de nascimento e valida que somente números foram digitados no formato "00/00/0000"
        System.out.print("Digite sua data de nascimento (no formato dd/mm/aaaa):");
        this.dataNascimento = scanner.nextLine();
        while (!dataNascimento.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            System.out.print("Por favor, digite a data de nascimento no formato correto:");
            this.setdataNascimento(scanner.nextLine());
        }

        // solicita o e-mail
        System.out.print("Digite seu e-mail:");
        this.email = scanner.nextLine();

        Telefone telefone = new Telefone();
        Telefone.TelefoneCelular();
    }

    private void setnomeCompleto(String s) {
    }

    private void setdataNascimento(String s) {
    }
}