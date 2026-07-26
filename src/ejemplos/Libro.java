package ejemplos;
public class Libro {



     private String titulo;
     private String autor;
    int paginas;

    String descripcion() {
        return titulo + " de " + autor + " (" + paginas + " paginas)";
    }

}
