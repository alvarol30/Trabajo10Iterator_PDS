import collection.CatalogoKindle;
import iterator.Iterator;
import model.Libro;

public class Main{
    public static void main(String[] args){
        CatalogoKindle catalogo= new CatalogoKindle();

        catalogo.agregarLibro(new Libro("IT", "Stephen King", "Viking", "Español", "Terror", 1986));
        catalogo.agregarLibro(new Libro("El Resplandor", "Stephen King", "Doubleday", "Español", "Terror", 1977));
        catalogo.agregarLibro(new Libro("Dune", "Frank Herbert", "Chilton", "Español", "Ciencia Ficcion", 1965));
        catalogo.agregarLibro(new Libro("1984", "George Orwell", "Secker", "Español", "Ciencia Ficcion", 1949));
        catalogo.agregarLibro(new Libro("Fahrenheit 451", "Ray Bradbury", "Ballantine", "Español", "Ciencia Ficcion", 1953));
        catalogo.agregarLibro(new Libro("Orgullo y Prejuicio", "Jane Austen", "T. Egerton", "Español", "Romance", 1813));

        Iterator iterator = catalogo.createIterator();
        System.out.println("******* CATALOGO AMAZON KINDLE *******\n");
        while(iterator.hasNext()){
            Libro libro = (Libro) iterator.next();
            System.out.println("Titulo    : " + libro.getTitulo());
            System.out.println("Autor     : " + libro.getAutor());
            System.out.println("Editorial : " + libro.getEditorial());
            System.out.println("Idioma    : " + libro.getIdioma());
            System.out.println("Genero    : " + libro.getGenero());
            System.out.println("Año       : " + libro.getAnio());
            System.out.println("------------------------------");
        }
    }
}