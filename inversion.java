import java.util.Scanner;

public class inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inversión con 2% mensual");
        System.out.print("Capital: ");
        int capital = sc.nextInt();
        int ganancia = capital * 2 / 100;
        int total = capital + ganancia;
        System.out.println("Ganancia: " + ganancia);
        System.out.println("Total final: " + total);
    }
}
