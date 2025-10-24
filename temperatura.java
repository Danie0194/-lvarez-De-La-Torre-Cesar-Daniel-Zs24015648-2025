import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convertir temperatura");
        System.out.print("Grados centígrados: ");
        int c = sc.nextInt();
        int f = (c * 9 / 5) + 32;
        int k = c + 273;
        System.out.println("Fahrenheit: " + f);
        System.out.println("Temperatura absoluta: " + k);
    }
}
