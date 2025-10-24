import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Longitud y área del círculo");
        System.out.print("Radio: ");
        int radio = sc.nextInt();

        int longitud = 2 * 3 * radio;  
        int area = 3 * radio * radio;  

        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);
    }
}
