import java.util.Scanner;

public class pagoempleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pago de empleado");
        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Categoría (1-4): ");
        int cat = sc.nextInt();

        int pagoHora = 0;

        if (cat == 1) pagoHora = 20000;
        else if (cat == 2) pagoHora = 15000;
        else if (cat == 3) pagoHora = 10000;
        else if (cat == 4) pagoHora = 7500;
        else System.out.println("Categoría no válida");

        int salario = horas * pagoHora;
        int descuento = salario * 72 / 1000; // 7.2%
        int total = salario - descuento;

        if (salario < 1000000) {
            int subsidio = salario * 15 / 100;
            total = total + subsidio;
        }

        System.out.println("Salario antes de descuentos: " + salario);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}
