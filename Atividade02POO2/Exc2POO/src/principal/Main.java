package principal;

import org.model.Livro;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Detalhes do livro---");

        Livro meuLivro = new Livro("O Pequeno Príncipe ", "Antoine de Saint-Exupéry", 35.50, "96");
        meuLivro.detalhesDoLivro();
    }
}