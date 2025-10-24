import java.util.Scanner;
public class Ejercicio20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double compra, desc, total;
        int num;
        System.out.println("Cuanto fue el total de la compra?");
        compra = sc.nextDouble();
        System.out.println("Cual numero saco?");
        num = sc.nextInt();
        if (num < 74)
        {
            desc = compra * 0.15;
        }
        else
        {
            desc = compra * 0.20;
        }

        total = compra - desc;
        System.out.println("Su descuento es: " + desc);
        System.out.println("El total a pagar es: " + total);
    }
}
