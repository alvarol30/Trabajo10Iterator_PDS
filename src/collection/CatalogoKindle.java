package collection;
import iterator.*;
import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class CatalogoKindle{
    private HashMap<String, List<Libro>> catalogo;

    public CatalogoKindle(){
        catalogo= new HashMap<>();
    }

    public void agregarLibro(Libro libro){
        if(catalogo.containsKey(libro.getGenero())){
            catalogo.get(libro.getGenero()).add(libro);
        }
        else{
            List<Libro> lista= new ArrayList<>();
            lista.add(libro);
            catalogo.put(libro.getGenero(), lista);
        }
    }

    public HashMap<String, List<Libro>> getCatalogo(){
        return catalogo;
    }
}
