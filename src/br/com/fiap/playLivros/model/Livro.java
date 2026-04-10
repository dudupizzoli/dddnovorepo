package br.com.fiap.playLivros.model;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;
    public Editora editora;
    public int paginas;
    public String resumo;

    //Construtor => É o responsável por definir como o objeto será criado
    //Todo construtor tem o nome da classe: Livro() => esse é o construtor padrão
    //Cria um objeto vazio.
    //Se eu fosse escrever o construtor padrão seria escrito dessa forma
    // public Livro(){}
    public Livro(String titulo){
        this.titulo = titulo;
    }

    //Sobrecarga de método => Métodos com mesmo nome e assinatura diferente
    public Livro(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }
    public Livro(String titulo, double preco, String autor){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }
}
