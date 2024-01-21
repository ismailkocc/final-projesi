import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class proje14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk tarihi (YYYY-MM-DD) formatında giriniz:");
        String tarih1Str = scanner.next();
        LocalDate tarih1 = LocalDate.parse(tarih1Str);

        System.out.println("İkinci tarihi (YYYY-MM-DD) formatında giriniz:");
        String tarih2Str = scanner.next();
        LocalDate tarih2 = LocalDate.parse(tarih2Str);

        Period fark = hesaplaTarihFarki(tarih1, tarih2);

        System.out.println("Gün farkı: " + fark.getDays() + " gün");
        System.out.println("Ay farkı: " + fark.getMonths() + " ay");
        System.out.println("Yıl farkı: " + fark.getYears() + " yıl");
    }

    public static Period hesaplaTarihFarki(LocalDate tarih1, LocalDate tarih2) {
        return Period.between(tarih1, tarih2);
    }
}