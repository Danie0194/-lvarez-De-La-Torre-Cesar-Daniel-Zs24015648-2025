import java.util.Scanner;

public class metrosapies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Convertir metros a pies y pulgadas");
        System.out.print("Metros: ");
        int metros = sc.nextInt();

        int pies = metros * 3;
        int pulgadas = metros * 39;

        System.out.println("Pies: " + pies);
        System.out.println("Pulgadas: " + pulgadas);
    }
}
