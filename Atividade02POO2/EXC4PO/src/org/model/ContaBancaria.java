package org.model;

public class ContaBancaria {

    public String numeroConta;

    private double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
}
