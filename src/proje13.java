import java.util.Scanner;

public class proje13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        double b = scanner.nextDouble();

        System.out.print("Üçüncü kenarı giriniz: ");
        double c = scanner.nextDouble();

        if (ucgenOluyorMu(a, b, c)) {
            if (eskenarUcgenMi(a, b, c)) {
                System.out.println("Bu üçgen bir eşkenar üçgendir.");
            } else if (ikizkenarUcgenMi(a, b, c)) {
                System.out.println("Bu üçgen bir ikizkenar üçgendir.");
            } else if (dikUcgenMi(a, b, c)) {
                System.out.println("Bu üçgen bir dik üçgendir.");
            } else {
                System.out.println("Bu üçgen ne eşkenar, ne ikizkenar, ne de dik üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
        }
    }

    public static boolean ucgenOluyorMu(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static boolean eskenarUcgenMi(double a, double b, double c) {
        return a == b && b == c;
    }

    public static boolean ikizkenarUcgenMi(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

    public static boolean dikUcgenMi(double a, double b, double c) {
        double[] kenarlar = { a, b, c };
        java.util.Arrays.sort(kenarlar); // Kenar uzunluklarını küçükten büyüğe sırala

        return kenarlar[0] * kenarlar[0] + kenarlar[1] * kenarlar[1] == kenarlar[2] * kenarlar[2];
    }
}