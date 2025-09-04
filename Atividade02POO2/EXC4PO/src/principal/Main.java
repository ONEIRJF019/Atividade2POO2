package principal;

import org.model.ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Demonstrando a Classe ContaBancaria ---");
        ContaBancaria minhaConta = new ContaBancaria("12345-6", 1500.75);
        minhaConta.exibirSaldo();
    }
}