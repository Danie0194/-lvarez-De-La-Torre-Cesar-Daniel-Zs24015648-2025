import java.util.Scanner;
public class comisiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Comisiones de un vendedor");
        int totalComision = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Valor de venta " + i + ": ");
            int venta = sc.nextInt();

            int comision = 0;

            if (venta <= 10000000) comision = venta * 2 / 100;
            else if (venta > 10000000 && venta < 15000000) comision = venta * 4 / 100;
            else if (venta >= 15000000) comision = venta * 10 / 100;

            totalComision = totalComision + comision;
        }

        System.out.println("Comisión total del mes: " + totalComision);
    }
}
