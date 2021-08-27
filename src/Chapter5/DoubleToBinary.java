package Chapter5;

public class DoubleToBinary {
    public static String printBinary(double num) {
        if (num >= 1 || num <= 0) {
            return "ERRUR";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        while (num > 0) {
            if (sb.length() >= 32) {
                return "ERROR";
            }

            double r = num * 2;
            if (r >= 1) {
                sb.append("1");
                num = r - 1;
            } else {
                sb.append("0");
                num = r;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        double a = 0.625;
        System.out.println(printBinary(a));

        int n = 0;

    }

}
