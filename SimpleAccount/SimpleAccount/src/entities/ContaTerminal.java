package entities;

public class ContaTerminal {

    private Integer numero;
    private String agencia;
    private String nome;
    private Double saldo;

    public ContaTerminal(Integer numero, String agencia, String nome, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá "+ this.nome.toUpperCase() +
               " obrigado por criar uma conta em nosso banco, sua agência é "+ this.agencia +
               ", conta " + this.numero +
               " e seu saldo "+ String.format("%.2f", this.saldo) +
               " já está disponível para saque";
    }
}
