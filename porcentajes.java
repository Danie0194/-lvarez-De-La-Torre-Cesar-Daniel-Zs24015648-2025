import java.util.Scanner;
public class Porcentajes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porcentaje de hombres y mujeres");
        System.out.print("Hombres: ");
        int h = sc.nextInt();
        System.out.print("Mujeres: ");
        int m = sc.nextInt();
        int total = h + m;
        int porH = h * 100 / total;
        int porM = m * 100 / total;
        System.out.println("Hombres: " + porH + "%");
        System.out.println("Mujeres: " + porM + "%");
    }
}
