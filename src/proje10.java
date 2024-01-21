public class proje10 {
    public static void main(String[] args) {
        int sayiAdedi = 20;
        int sayi = 2; // İlk asal sayı

        System.out.println(sayiAdedi + " adet asal sayı:");

        for (int i = 0; i < sayiAdedi; ) {
            if (asalMi(sayi)) {
                System.out.print(sayi + " ");
                i++;
            }
            sayi++;
        }
    }

    public static boolean asalMi(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}