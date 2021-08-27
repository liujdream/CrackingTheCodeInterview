package Chapter8;

public class TripleStep {

    static int calcStep(int steps) {
        if (steps == 0) {
            return 0;
        } else if (steps == 1) {
            return 1;
        } else if (steps == 2) {
            return 2;
        } else if (steps == 3) {
            return 4;
        } else {
            return calcStep(steps - 1) + calcStep(steps - 2) + calcStep(steps - 3);
        }
    }

    static int countWays(int steps){
        if(steps < 0){
            return 0;
        }else if(steps == 0){
            return 1;
        }else{
            return countWays(steps - 1) + countWays( steps-2) + countWays( steps - 3);
        }

    }

    public static void main(String[] args) {
        int steps = 20;
        int ans = calcStep(steps);
        int ans2 = countWays(steps);
        System.out.println("possible ways for steps: " + steps + ": " + ans + ", " + ans2);
    }

}
