package biblioteca_;

public class BibliotecaMain {

    public static void main(String[] args) {
        // Crear objetos
        MaterialBiblioteca material1 = new MaterialBiblioteca("El Quijote", "Miguel de Cervantes", 1605, true);
        Libro libro1 = new Libro("1984", "George Orwell", 1949, true, "Distopía", 328);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, true, "Realismo mágico", 417);
        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813, false, "Romance", 279);

        // Mostrar
        material1.mostrarDatos();
        libro1.mostrarDatos();
        System.out.println("===================");

        // Prestar
        material1.prestar();
        libro1.prestar(14);
        System.out.println("===================");

        // Renovar disponibilidad
        libro1.renovarDisponibilidad();
        System.out.println("===================");

        // Mostrar datos después de renovar disponibilidad
        libro1.mostrarDatos();
    }
}
