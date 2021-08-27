package Chapter3;

import javax.management.QueryEval;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    public QueueNode<T> first;
    public QueueNode<T> last;

    public void add(T item) {
        QueueNode<T> queueNode = new QueueNode<>(item);
        if (last != null) {
            last.next = queueNode;
        }
        last = queueNode;
        if (first == null) {
            first = last;
        }
    }

    public T remvoe() {
        if (first == null) throw new NoSuchElementException();

        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }


}
