import java.util.Scanner;

public class proje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir decimal sayı giriniz: ");
        int decimal = scanner.nextInt();

        String binary = decimalToBinary(decimal);

        System.out.println("Binary karşılığı: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Binary stringin başına ekler
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}
