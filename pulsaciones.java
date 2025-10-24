import java.util.Scanner;

public class pulsaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular pulsaciones");
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        int pulsaciones = (220 - edad) / 10;

        System.out.println("Pulsaciones cada 10 seg: " + pulsaciones);
    }
}
