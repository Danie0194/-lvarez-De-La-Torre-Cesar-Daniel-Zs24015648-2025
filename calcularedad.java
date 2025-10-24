import java.util.Scanner;
public class calcularedad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular edad");
        System.out.print("Año actual: ");
        int añoactual = sc.nextInt();
        System.out.print("Año de nacimiento: ");
        int añonacimiento = sc.nextInt();

        int edad = añoactual - añonacimiento;

        System.out.println("Tu edad es: " + edad);
    }
}
