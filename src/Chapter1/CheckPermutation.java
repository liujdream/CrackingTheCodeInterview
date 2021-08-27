package Chapter1;

public class CheckPermutation {
    boolean checkPermutation(String s1, String s2){
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        if(s1.length() != s2.length()) return false;
        java.util.Arrays.sort(s1Array);
        String s1String = new String(s1Array);

        java.util.Arrays.sort(s2Array);
        String s2String = new String(s2Array);

        return  s1String.equals(s2String);

    }

    public static void main(String[] args) {
        int a = -93242;

        int b = ~0-1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
    }

}
