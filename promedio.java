import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Promedio de 3 materias");
        System.out.print("Materia 1: ");
        int m1 = sc.nextInt();
        System.out.print("Materia 2: ");
        int m2 = sc.nextInt();
        System.out.print("Materia 3: ");
        int m3 = sc.nextInt();
        int promedio = (m1 + m2 + m3) / 3;
        System.out.println("Promedio general: " + promedio);
    }
}
