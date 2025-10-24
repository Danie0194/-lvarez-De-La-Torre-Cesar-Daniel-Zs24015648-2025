import java.util.Scanner;
public class ecuacioncuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ecuación cuadrática A*x^2 + B*x + C = 0");
        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        System.out.print("C: ");
        int C = sc.nextInt();
        if (A == 0) {
            System.out.println("No es una ecuación cuadrática");
        } else {
            int discriminante = (B * B) - (4 * A * C);
            if (discriminante < 0) {
                System.out.println("Raíces imaginarias");
            } else {
                System.out.println("Raíces reales");
            }
        }
    }
}
