package br.com.fiap.playLivros.model;

public class Usuario {
    // - private => menor nível de acesso (o - significa private no diagrama)
    private String nome;
    private String foto;

    //método getter => devolve o conteúdo do atributo
    public String getNome(){
        return nome;
    }
    //método setters => recebe uma informação e guarda no atributo
    public void setNome(String nome){
        this.nome = nome;
    }

    public String exibirDados(){
        return foto + "Usuário: " + nome;
    }
}
