package iterator;
import model.Libro;
import java.util.HashMap;
import java.util.List;

public class HashMapIterator implements Iterator{
    private java.util.Iterator<List<Libro>> entryIterator;
    private java.util.Iterator<Libro> listaIterator;

    public HashMapIterator(HashMap<String, List<Libro>> catalogo){
        entryIterator = catalogo.values().iterator();
        if(entryIterator.hasNext()){
            listaIterator= entryIterator.next().iterator();
        }
    }

    @Override
    public boolean hasNext(){
        if(listaIterator==null) return false;
        if(listaIterator.hasNext()) return true;

        while (entryIterator.hasNext()){
            listaIterator = entryIterator.next().iterator();
            if(listaIterator.hasNext()) return true;
        }
        return false;
    }

    @Override
    public Object next(){
        if(!hasNext()) return null;
        return listaIterator.next();
    }
}