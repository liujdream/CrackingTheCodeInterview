package Chapter2;

import javax.naming.LinkLoopException;

public class kThToLastV2 {

    public static Node kthToLast(Node p, int idx){
        Node p1 = p;
        Node p2 =p;
        for( int i = 0; i < idx; i ++){
            if(p1 == null) return  null;
            p1 = p1.next;
        }

        while(p1!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    public static boolean deleteNodeInTheMiddle(Node p ){
        if( p == null || p.next == null){
            return false;
        }
        Node next = p.next;
        p.data = next.data;
        p.next = next.next;
        return true;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        LinkedList l = new LinkedList(head);
        l.insert(11);

        l.insert(12);
        l.insert(13);
        l.insert(14);
        l.insert(15);
        l.insert(16);
        l.insert(17);
        l.insert(18);
        l.insert(19);
        l.insert(20);

        Node n = kthToLast(head, 2);
        System.out.println( n.data);
    }
}
