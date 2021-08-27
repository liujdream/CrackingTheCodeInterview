package Chapter2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    private static void removeDup(Node headNode) {
        Set<Long> valueSet = new HashSet<>();
        Node previous = null;
        while (headNode != null) {
            if (valueSet.contains(headNode.data)) {
                System.out.println("remove dup " + headNode.data);
                previous.next = headNode.next;
            } else {
                valueSet.add(headNode.data);
                previous = headNode;
            }
            headNode = headNode.next;
        }

    }

    private static void removeDupWithoutBuffer(Node headNode) {
        Node current = headNode;

        while (current != null) {
            Node nextOne = current;
            while (nextOne.next != null) {
                if (nextOne.next.data == current.data) {
                    nextOne.next = nextOne.next.next;
                } else {
                    nextOne = nextOne.next;
                }

            }
            current = current.next;

        }

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        LinkedList linkedList = new LinkedList(head);
        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(3);
        linkedList.insert(8);
        linkedList.insert(6);
        linkedList.insert(5);
        linkedList.insert(8);
        linkedList.insert(6);
        linkedList.insert(8);
        linkedList.insert(19);
        linkedList.insert(10);

        removeDupWithoutBuffer(head);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }


}
