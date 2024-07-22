package biblioteca_;

public class MaterialBiblioteca {

    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    // Constructor
    public MaterialBiblioteca(String titulo, String autor, int añoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = disponible;
    }

    // Métodos
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El material ha sido prestado.");
        } else {
            System.out.println("El material no está disponible.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    // Primer método con valor de retorno
    public boolean estaDisponible() {
        return disponible;
    }

    // Segundo método con parámetros
    public void actualizarDisponibilidad(boolean disponibilidad) {
        this.disponible = disponibilidad;
    }

}
