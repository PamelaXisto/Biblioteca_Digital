package br.com.fecaf.model;


import javax.persistence.*;

@Entity
@Table(name = "tbl_livros")
public class Livro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String isbn;
    private String autor;
    private String genero;
    private Integer data_lancamento;
    private String sinopse;
    private String foto;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(int data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
