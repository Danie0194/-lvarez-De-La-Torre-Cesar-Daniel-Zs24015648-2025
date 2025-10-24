import java.util.Scanner;
public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nuevo salario con incremento del 25%");
        System.out.print("Salario actual: ");
        int salario = sc.nextInt();
        int nuevoSalario = salario + (salario * 25 / 100);
        System.out.println("Nuevo salario: " + nuevoSalario);
    }
}
