package Chapter2;

public class LoopDetection {
    static Node findLoopStart(Node l){
        Node slow = l;
        Node fast = l;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;
            }
        }

        if(fast==null || fast.next == null){
            return null;
        }

        slow = l;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
