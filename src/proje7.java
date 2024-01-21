import java.util.Scanner;

public class proje7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;
        int toplamBuyuk = 0;
        int toplamKucuk = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz (0-100 arası): ");
            sayi = scanner.nextInt();

            if (sayi >= 0 && sayi <= 100) {
                if (sayi >= 50) {
                    toplamBuyuk += sayi;
                } else {
                    toplamKucuk += sayi;
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen 0-100 arası bir sayı giriniz.");
                i--; // Geçersiz giriş durumunda döngüyü tekrarlamak için i'yi azalt
            }
        }

        if (toplamKucuk != 0) {
            double oran = (double) toplamBuyuk / toplamKucuk;
            System.out.println("50 ve üstü olanların toplamı / 50'den küçük olanların toplamı oranı: " + oran);
        } else {
            System.out.println("50'den küçük olan sayıların toplamı sıfır olduğu için oran hesaplanamaz.");
        }
    }
}