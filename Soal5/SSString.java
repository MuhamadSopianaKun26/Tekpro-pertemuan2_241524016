package Soal5;

import java.util.Scanner;

public class SSString {
    public static void main(String[] args) {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        // Membaca input
        System.out.print("Masukkan kata A: ");
        String A = scanner.nextLine();
        System.out.print("Masukkan kata B: ");
        String B = scanner.nextLine();

        // Menjumlahkan panjang string A dan B
        int totalLength = A.length() + B.length();
        System.out.println("Panjang kedua kata: " + totalLength);

        // Menentukan apakah A lebih besar secara leksikografis dari B
        System.out.print("Secara leksikografis, ");
        if (A.compareTo(B) > 0) {
            System.out.println("Kata A lebih besar dari kata B");
        } else if (A.compareTo(B) < 0) {
            System.out.println("Kata B lebih besar dari kata A");
        }else{
            System.out.println("Kata B dan B sama besar ");
        }

        // Mengkapitalisasi huruf pertama dari A dan B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Menampilkan hasil
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
