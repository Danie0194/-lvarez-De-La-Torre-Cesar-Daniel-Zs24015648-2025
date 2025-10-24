import java.util.Scanner;
public class valoracion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valoración según nota");
        System.out.print("Nota (0 a 5): ");
        int nota = sc.nextInt();
        if (nota >= 0 && nota <= 1) System.out.println("P (Pésimo)");
        else if (nota >= 2 && nota <= 2) System.out.println("M (Mal)");
        else if (nota >= 2 && nota <= 2) System.out.println("R (Regular)");
        else if (nota >= 3 && nota <= 4) System.out.println("B (Bien)");
        else if (nota >= 4 && nota <= 5) System.out.println("E (Excelente)");
        else System.out.println("Nota no válida");
    }
}
