import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c,u;
        System.out.println("Üçgenin 1. kenarını giriniz: ");
        a = input.nextInt();
        System.out.println("Üçgenin 2. kenarını giriniz: ");
        b= input.nextInt();
        System.out.println("Üçgenin 3. kenarını giriniz: ");
        c = input.nextInt();
        u = (a+b+c)/2;
        System.out.println("Üçgenin Çevresi: " + (a+b+c));
        System.out.print("Üçgenin Alanı: " + Math.sqrt((u * (u - a)* (u - b) * (u - c))));

    }



}
