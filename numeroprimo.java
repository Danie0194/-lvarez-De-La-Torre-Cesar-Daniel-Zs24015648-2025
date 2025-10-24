import java.util.Scanner;
public class numeroprimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número primo o no");
        System.out.print("Número: ");
        int n = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) divisores++;
        }
        if (divisores == 2) System.out.println("El número es primo");
        else System.out.println("El número no es primo");
    }
}
