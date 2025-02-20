package Soal3;

public class FloatingPoint {
    public static void main(String[] args) { 
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();

        double x = 92.98;
        int nx = (int) Math.round(x);

        System.out.print("nilai akhir nx : "+nx);
        }
}