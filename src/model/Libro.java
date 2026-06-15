package model;
public class Libro{
    private String titulo, autor, editorial, idioma, genero;
    private int anio;

    public Libro (String titulo, String autor, String editorial, String idioma, String genero, int anio){
        this.titulo= titulo;
        this.autor= autor;
        this.editorial= editorial;
        this.idioma= idioma;
        this.genero= genero;
        this.anio= anio;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getIdioma() {
        return idioma;
    }
    public String getGenero() {
        return genero;
    }
    public int getAnio(){
        return anio;
    }

}
