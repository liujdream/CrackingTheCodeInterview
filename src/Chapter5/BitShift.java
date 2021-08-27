package Chapter5;

public class BitShift {

    static int repeatedArithmeticShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>= 1;
        }
        return x;
    }

    static int repeatedLogicalShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>>= 1;
        }
        return x;
    }



    public static void main(String[] args) {
        int x = -93242;
        int count = 40;

        int a = repeatedArithmeticShift(x, count);
        int b = repeatedLogicalShift(x, count);

        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));



    }
}
