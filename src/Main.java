import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double kenar1;
        double kenar2;

        System.out.print("İlk kenarı giriniz : ");
        kenar1 = giris.nextDouble();

        System.out.print("İkinci kenarı giriniz : ");
        kenar2 = giris.nextDouble();

        double hipotenus;

        hipotenus = Math.sqrt( (kenar1*kenar1) + (kenar2*kenar2) );
        System.out.println("Hipotenüs : " + hipotenus);

        double alan;

        alan = ((kenar1*kenar2)/2);
        System.out.println("Üçgenin alanı : " + alan);
    }
}