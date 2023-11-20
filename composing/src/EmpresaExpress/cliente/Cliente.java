package EmpresaExpress.cliente;

import EmpresaExpress.funcionarios.Funcionario;
import EmpresaExpress.utils.Pessoa;

public class Cliente extends Pessoa {
    private static String ocupacaoProfissional;
    private static String TelefoneCelular;
    private static String rua;
    private static String numero;
    private static String complemento;
    private static String bairro;
    private static String cidade;
    private static String estado;
    private static String cep;


    public void setOcupacaoProfissional() {
        ocupacaoProfissional = ocupacaoProfissional;
    }

    public void setTelefoneCelular(String telefoneCelular) {TelefoneCelular = telefoneCelular; }

    public void setRua(String rua) {
        Cliente.rua = rua;
    }

    public void setNumero(String numero) {
        Cliente.numero = numero;
    }

    public void setComplemento(String complemento) {Cliente.complemento = complemento; }
