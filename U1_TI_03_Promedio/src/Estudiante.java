
public class Estudiante {
    private String nombre;
    private String matricula;
    private Double[] notas = new Double[5];
    private Double promedio;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void setNota(int i, double nota) {
        if (i >= 0 && i < 5) {
            notas[i] = nota;
        } 
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += notas[i];
        }
        promedio = suma / 5;
        return promedio;
    }

    public boolean aprobado() {
        if (promedio == null) {
            calcularPromedio();
        }
        return promedio >= 70;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
