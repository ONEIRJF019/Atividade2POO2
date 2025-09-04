package principal;

import org.model.Aluno;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Demonstrando a Classe Aluno ---");


        Aluno meuAluno = new Aluno("Maria Silva", 20, "2023001", "Engenharia de Software");
        meuAluno.exibirInformacoes();
    }
}