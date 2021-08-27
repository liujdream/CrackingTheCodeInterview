package Chapter2;

import java.util.Stack;

public class isPalindrome {

    static boolean isPalindromeList(Node l){
        Node current = l;
        Node runner = current;
        int count =  0;
        Stack<Long> value = new Stack<>();
        while(runner != null && runner.next!=null){
            runner = runner.next.next;
            value.push(current.data);
            current = current.next;
        }

        // deal with odd number
        if(runner!=null){
            current = current.next;
        }
        while(!value.empty()){
            if(current.data!=value.pop()){
                return  false;
            }
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node node1 = new Node(9);
        LinkedList linkedList1 = new LinkedList(node1);
        linkedList1.insert(1);
        linkedList1.insert(3);
        linkedList1.insert(2);
        linkedList1.insert(9);

        System.out.println(isPalindromeList(node1));
    }
}
