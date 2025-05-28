import java.util.Scanner;

public class Estudiante {
    private String nombre, matricula;
    private Double[] notas = new Double[5];
    private Double promedio;

    Scanner scanner = new Scanner(System.in);

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public double calcularPromedio() {
        double suma = 0;
        System.out.println("Dame 5 calificaciones: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }
        promedio = suma / 5;
        return promedio;
    }

    
}
