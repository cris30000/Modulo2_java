package ejemplos;
//public class App {
    /*public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.raza = "Labrador";
        miPerro.ladrar();

        // ahora vamos a crear otro perro
        Perro otroPerro = new Perro();
        otroPerro.nombre = "Rocky";
        otroPerro.ladrar();
    
    }*/

        // para comentar con contro alt + c y para descomentar con control alt + u
/*
 
    public class AppLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "Clean Code";
        libro.autor = "Robert Martin";
        libro.paginas = 464;
        System.out.println(libro.descripcion());
        //libro.descripcion();
    }
}
*/
//  
// ! Ejemplo producto
public class AppProducto {
    public static void main(String[] args) {
        Producto vacio = new Producto();
        vacio.mostrar();

        Producto cafe = new Producto("Cafe", 12000.0);
        cafe.mostrar();
    }
}
