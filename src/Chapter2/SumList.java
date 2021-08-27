package Chapter2;

import java.util.Stack;

public class SumList {

    static Node sumList(Node l1, Node l2){
        Node dummyHead = new Node(0);
        Node p1 = l1;
        Node p2 = l2;
        long carry = 0;
        Node curr = dummyHead;
        while(p1!=null || p2!=null){
            long x = (p1!=null)? p1.data:0;
            long y = (p2!=null)? p2.data:0;
            long sum = carry + x + y;
            carry = sum/10;
            curr.next = new Node(sum%10);
            curr = curr.next;
            if(p1!=null) p1 = p1.next;
            if(p2!=null) p2 = p2.next;

        }

        if(carry > 0 ){
            curr.next = new Node(carry);
            curr = curr.next;
        }
        return dummyHead.next;

    }

    static Node sumListReverse(Node l1, Node l2){
        Stack<Long> s1 = new Stack<Long>();
        Stack<Long> s2 = new Stack<Long>();

        while(l1 != null) {
            s1.push(l1.data);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.data);
            l2 = l2.next;
        }

        int sum = 0;
        Node list = new Node(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.data = sum % 10;
            Node head = new Node(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }

        return list.data == 0 ? list.next : list;
    }


    public static void main(String[] args) {
        Node node1 = new Node(9);
        LinkedList linkedList1 = new LinkedList(node1);
        linkedList1.insert(9);
        linkedList1.insert(9);
        linkedList1.insert(9);
        linkedList1.insert(9);
        linkedList1.insert(9);
        linkedList1.insert(9);

        Node node2 = new Node(9);
        LinkedList linkedList2 = new LinkedList(node2);
        linkedList2.insert(9);
        linkedList2.insert(9);
        linkedList2.insert(9);

        Node sum = sumList(node1, node2);
        printList(node1);
        printList(node2);
        printList(sum);

        System.out.println("Reverse Sum:");
        Node node3 = new Node(9);
        LinkedList linkedList3 = new LinkedList(node3);
        linkedList3.insert(9);
        linkedList3.insert(9);
        linkedList3.insert(9);

        Node node4 = new Node(9);
        LinkedList linkedList4 = new LinkedList(node4);
        linkedList4.insert(9);
        linkedList4.insert(9);

        Node sumReverse = sumListReverse(node3, node4);
        printList(node3);
        printList(node4);
        printList(sumReverse);

    }

    static void printList(Node l){
        while(l!=null){
            System.out.print(l.data);
            l = l.next;
            if(l!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }



}
