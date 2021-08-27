package Chapter5;

public class Insertion {


    public int insert(int original, int insertNum, int start, int end){
        int allOnes = ~0;

        int left = allOnes << (start+1);
        int right = (1<<end) - 1;
        int mask = left | right;

        int clear = original&mask;
        int insertShift = insertNum << end;
        return clear | insertShift;

    }
}
