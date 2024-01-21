public class proje8 {
    public static void main(String[] args) {
        int n = 20; // İlk 20 Fibonacci sayısını bulmak için

        int[] fibonacciSerisi = new int[n];

        // İlk iki Fibonacci sayısını belirle
        fibonacciSerisi[0] = 0;
        fibonacciSerisi[1] = 1;

        // Fibonacci serisini hesapla ve diziye ekle
        for (int i = 2; i < n; i++) {
            fibonacciSerisi[i] = fibonacciSerisi[i - 1] + fibonacciSerisi[i - 2];
        }

        // Sonucu ekrana yazdır
        System.out.println("Fibonacci Serisi (ilk " + n + " sayı):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSerisi[i] + " ");
        }
    }
}