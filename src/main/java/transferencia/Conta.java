package transferencia;

import sun.security.x509.OtherName;

public class Conta {
    //objetos
    private String agencia;
    private String numeroConta;
    private double saldo;
    private Cliente proprietario;

    //construtores
    public Conta(String agencia, String numeroConta, double saldo, Cliente proprietario) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    //metodos
    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void realizarDeposito(double valor) {
        saldo += valor;
    }

    public boolean realizarSaque(double valor) {

        if (valor > saldo) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public boolean realizarTransferencia(double valor, Conta destino) {
        if (realizarSaque(valor)) {
            destino.realizarDeposito(valor);
            return true;
        }
        return false;
    }
}
