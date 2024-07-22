package biblioteca_;

public class Libro extends MaterialBiblioteca {

    private String genero;
    private int numeroPaginas;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible, String genero, int numeroPaginas) {
        super(titulo, autor, anioPublicacion, disponible);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    // Método adicional
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Genero: " + genero);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    // Sobrecarga de métodos
    public void prestar(int dias) {
        if (estaDisponible()) {
            actualizarDisponibilidad(false);
            System.out.println("El libro ha sido prestado por " + dias + " días.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    // Método para renovar disponibilidad
    @Override
    public void renovarDisponibilidad() {
        super.renovarDisponibilidad();
    }
}
