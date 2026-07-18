public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.raza = "Labrador";
        miPerro.ladrar();

        // ahora vamos a crear otro perro
        Perro otroPerro = new Perro();
        otroPerro.nombre = "Rocky";
        otroPerro.ladrar();
    
    }
}
