package Soal4;

public class S4ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    public static void main(String[] args) {

        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
                
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

