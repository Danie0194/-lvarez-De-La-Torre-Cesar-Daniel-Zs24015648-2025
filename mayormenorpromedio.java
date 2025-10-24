import java.util.Scanner;
public class mayormenorpromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tres números diferentes");
        System.out.print("Número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Número 2: ");
        int n2 = sc.nextInt();
        System.out.print("Número 3: ");
        int n3 = sc.nextInt();
        if (n1 == n2 && n2 == n3) {
            System.out.println("Todos son iguales");
        } else {
            int mayor = n1;
            if (n2 > mayor) mayor = n2;
            if (n3 > mayor) mayor = n3;

            int menor = n1;
            if (n2 < menor) menor = n2;
            if (n3 < menor) menor = n3;
            int promedio = (n1 + n2 + n3) / 3;
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Promedio: " + promedio);
        }
    }
}
