package Chapter3;

import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> r = new Stack<>();
        while(!s.isEmpty()){
            Integer tmp = s.pop();
            while(!r.isEmpty() && r.peek() > tmp){
                s.push(r.pop());
            }
            r.push(tmp);
        }
        return r;
    }
}
