import java.util.Scanner;
public class Paronon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número par o non");
        System.out.print("Número: ");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("El número es par");
        else System.out.println("El número es non");
    }
}
