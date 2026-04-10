package br.com.fiap.playLivros.model;

import java.time.LocalDate;

public class Avaliacao {
    public int estrelas;
    public String titulo;
    public LocalDate dataComentario;
    public String comentario;
    public Usuario usuario;
    public boolean aprovado;
}
