package biblioteca_;

public class BibliotecaMain {

    public static void main(String[] args) {
        MaterialBiblioteca material1 = new MaterialBiblioteca("El Quijote", "Miguel de Cervantes", 1605, true);
        Libro libro1 = new Libro("1984", "George Orwell", 1949, true, "Distopía", 328);

        material1.mostrarDatos();
        libro1.mostrarDatos();
        System.out.println("===================");
        material1.prestar();
        libro1.prestar(14);
        System.out.println("===================");
        material1.mostrarDatos();
    }
}
