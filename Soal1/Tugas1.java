package Soal1;

import java.util.Scanner;
import java.util.function.Consumer;

public class Tugas1 {   // function untuk menentukan tipe data yang dapat dipakai oleh Input
    static boolean NumbFit (String input, Consumer<String> parser ) {
        try { 
            parser.accept(input);
            return (true);
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  // Clear Screen
        System.out.flush();

        try (Scanner scanner = new Scanner(System.in)) { // Scanner otomatis ditutup
            System.out.print("Number of Input Test : ");
            int Indeks = scanner.nextInt(); // Membaca jumlah input case yang ingin diujikan
            scanner.nextLine(); // menghindari terbaca nya \n

            System.out.println();
            String[] inputs = new String[Indeks];   //deklarasi array

            for (int i = 0; i < Indeks; i++) {      //Itterasi menginput number yang ingin di cek
                System.out.print("Masukan angka ke- " + (i+1)+" : ");
                String n = scanner.nextLine(); // Membaca input sebagai long
                inputs[i] = n;
            }   


            System.out.println();
            for (String input : inputs) {       //Itterasi untuk memeriksa semua input
                if (!NumbFit(input, Byte::parseByte) &&
                        !NumbFit(input, Short::parseShort) &&
                        !NumbFit(input, Integer::parseInt) &&
                        !NumbFit(input, Long::parseLong)) {
                    System.out.println(input + " can't be fitted anywhere.\n");
                } else {
                    System.out.println(input + " can be fitted in:");
                    if (NumbFit(input, Byte::parseByte)) {
                        System.out.println("* byte");
                    }
                    if (NumbFit(input, Short::parseShort)) {
                        System.out.println("* short");
                    }
                    if (NumbFit(input, Integer::parseInt)) {
                        System.out.println("* int");
                    }
                    if (NumbFit(input, Long::parseLong)) {
                        System.out.println("* long");
                    }
                    System.out.println();
                }
            }
        }       
    }
}
