Elegimos HashMap porque en un catálogo como Kindle los libros 
naturalmente se agrupan por género. Tiene sentido que si alguien 
busca Terror, el sistema vaya directo a ese grupo sin revisar 
toda la colección.

La estructura que usamos es HashMap<String, List<Libro>>, donde 
la clave es el género y el valor es la lista de libros de ese 
género. Así agregar un nuevo género no rompe nada, simplemente 
aparece como una entrada nueva en el mapa.
La contra es que el HashMap no garantiza un orden fijo al 
recorrerlo, pero para este caso no nos importa en qué orden 
salen los géneros, sino poder encontrarlos rápido. Si el orden 
fuera importante usaríamos un LinkedHashMap o un TreeMap, pero 
eso sería sacrificar simplicidad por algo que el caso no requiere.

El HashMapIterator resuelve el problema de recorrer esta 
estructura anidada manteniendo dos iteradores internos: uno que 
va saltando de género en género, y otro que va libro por libro 
dentro del género actual. Cuando se agotan los libros de un 
género, automáticamente salta al siguiente. El cliente no ve 
nada de eso, solo llama hasNext() y next() como con cualquier 
otra colección.
