package Chapter2;

public class LinkedList {
    Node head;

    LinkedList(){
        head = null;
    }


    LinkedList(Node head){
        this.head = head;
    }

    void insert(long data){
        Node end = new Node(data);
        Node now = head;
        while( now.next != null){
            now = now.next;
        }
        now.next = end;
    }

    void remove(long data){
        Node now = head;
        if(head.data==data){
            head = head.next;
        }else {
            while(now.next!=null){
                if(now.next.data == data){
                    now.next = now.next.next;
                }
            }
            now = now.next;
        }
    }
}
