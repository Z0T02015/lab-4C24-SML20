public class StudentController {

    // Método principal que controla la lógica del estudiante
    public void controller() {
        System.out.println("=== Controlador de Estudiantes ===");
        mostrarEstudiante("Juan Pérez", 20, "Ingeniería de Software");
    }

    // Método auxiliar para mostrar información de un estudiante
    private void mostrarEstudiante(String nombre, int edad, String carrera) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
    }
}

