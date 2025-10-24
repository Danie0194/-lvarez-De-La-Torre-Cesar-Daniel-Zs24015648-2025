import java.util.Scanner;
public class llamada{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int min;
        double total;
        System.out.println("Cuantos minutos duro la llamada?");
        min = sc.nextInt();
        if (min <= 3)
        {
            total = 10;
        }
        else
        {
            total = 10 + (min - 3) * 1;
        }
        System.out.println("Tiene que pagar: " + total);
    }
}
