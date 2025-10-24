import java.util.Scanner;
public class descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Descuento del 15%");
        System.out.print("Total de la compra: ");
        int compra = sc.nextInt();
        int desc = compra * 15 / 100;
        int total = compra - desc;
        System.out.println("Descuento: " + desc);
        System.out.println("Total a pagar: " + total);
    }
}
