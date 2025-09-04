package org.model;

public class Livro {

    public String titulo;


    private String autor;


    protected double preco;


    String paginas;


    public Livro(String titulo, String autor, double preco, String paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
    }


    public void detalhesDoLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
        System.out.println("Páginas: " + paginas);
    }
}


