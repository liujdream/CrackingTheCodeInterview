package Chapter3;

import java.util.Stack;

public class MyQueueWithTwoStacks<T> {
    Stack<T> stackNew, stackOld;

    public MyQueueWithTwoStacks() {
        stackNew = new Stack<>();
        stackOld = new Stack<>();
    }

    public void add(T value){
        stackNew.add(value);
    }

    private void shiftStack(){
        if(stackOld.isEmpty()){
            while(!stackNew.isEmpty()){
                stackOld.push(stackNew.pop());
            }
        }
    }

    public T peek(){
        shiftStack();
        return stackOld.peek();
    }

    public T pop(){
        shiftStack();
        return stackOld.pop();
    }
}
