import java.util.Scanner;

public class proje17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine().toLowerCase();

        int sesliHarfSayisi = 0;
        int sessizHarfSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);

            if (karakter >= 'a' && karakter <= 'z') {

                if (karakter == 'a' || karakter == 'e' || karakter == 'ı' || karakter == 'i' ||
                        karakter == 'o' || karakter == 'ö' || karakter == 'u' || karakter == 'ü') {
                    sesliHarfSayisi++;
                } else {
                    sessizHarfSayisi++;
                }
            }
        }

        System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz harf sayısı: " + sessizHarfSayisi);
    }
}