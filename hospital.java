import java.util.Scanner;
public class hospital 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double p, g, t, pe;

        System.out.println("Cual es el presupuesto total?");
        p = sc.nextDouble();
        g = p * 0.40;
        t = p * 0.30;
        pe = p * 0.30;
        System.out.println("Ginecologia recibe: " + g);
        System.out.println("Traumatologia recibe: " + t);
        System.out.println("Pediatria recibe: " + pe);
    }
}
