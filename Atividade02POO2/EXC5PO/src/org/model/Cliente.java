package org.model;

public class Cliente {

    protected String nome;

    String cpf;

    public Cliente() {

    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDadosCliente() {
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("CPF do Cliente: " + cpf);
    }
}
