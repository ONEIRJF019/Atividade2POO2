package principal;

import org.model.Cliente;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Demonstrando a Classe Cliente ---");
        Cliente meuCliente = new Cliente("João Souza", "123.456.789-00");

        meuCliente.exibirDadosCliente();
    }
}