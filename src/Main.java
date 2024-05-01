import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int fechaDeLazamiento = 1999;
        double evaluacion = 0;
        boolean incluidoEnElPlanBasico = true;
        String nombre= "Matrix";
        String sinopsis = """
                La mejor película del milenio
                """;

        double mediaEvaluacionUsuario = 0;
        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLazamiento);
        //System.out.println("Evaluació: " + evaluacion);
        System.out.println("Incluído en el plan básico: " + incluidoEnElPlanBasico);

        //System.out.println("Media de la evaluación: " + mediaEvaluacionUsuario);

        if (fechaDeLazamiento >= 2023){
            System.out.println("Película popular actualmente");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la película Mtrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}