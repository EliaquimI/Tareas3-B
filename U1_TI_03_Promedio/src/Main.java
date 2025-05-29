import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("--------BOLETA DE CALIFICACIONES--------");
System.out.println("                           C:");
        System.out.println("            Estudiante 1");
        Estudiante estudianteUno = crearEstudiante(scanner);
        System.out.println("            Estudiante 2");
        Estudiante estudianteDos = crearEstudiante(scanner);
        System.out.println("            Estudiante 3");
        Estudiante estudianteTres = crearEstudiante(scanner);
        System.out.println("            Estudiante 4");
        Estudiante estudianteCuatro = crearEstudiante(scanner);
        System.out.println("            Estudiante 5");
        Estudiante estudianteCinco = crearEstudiante(scanner);
        mostrarEstudiante(estudianteUno);
        mostrarEstudiante(estudianteDos);
        mostrarEstudiante(estudianteTres);
        mostrarEstudiante(estudianteCuatro);
        mostrarEstudiante(estudianteCinco);
    }

    public static Estudiante crearEstudiante(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, matricula);

        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            estudiante.setNota(i, nota);
        }
        return estudiante;
    }

    public static void mostrarEstudiante(Estudiante estudianteZzz) {
        double promedio = estudianteZzz.calcularPromedio();
        System.out.println("\nNombre: " + estudianteZzz.getNombre());
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Aprobado?: " + (estudianteZzz.aprobado() ? "Sí" : "No"));
        System.out.println("--------------------------");
    }
}
