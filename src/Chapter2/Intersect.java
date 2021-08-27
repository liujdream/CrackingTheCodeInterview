package Chapter2;

public class Intersect {
    private static Node findIntersect(Node l1, Node l2){
        if(l1==null || l2==null) return null;
        boolean intersecFlag = isIntersect(l1, l2);
        if(!intersecFlag) return null;

        Result l1Result = getTailAndSize(l1);
        Result l2Result = getTailAndSize(l2);


        Node shorter = l1Result.size < l2Result.size ? l1:l2;
        Node longer = l1Result.size < l2Result.size ? l2:l1;


        int sizeDiff = Math.abs(l1Result.size - l2Result.size);
        while(sizeDiff>0){
            longer = longer.next;
            sizeDiff -= 1;
        }

        while(shorter!=longer) {

            shorter = shorter.next;
            longer = longer.next;
        }
        return shorter;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        first.next = second;
        second.next = third;

        Node first2 = new Node(100);
        Node second2 = new Node(1001);
        Node third2 = new Node(2100);
        Node fourth2 = new Node(200);
        Node five2 = new Node(2001);
        first2.next = second2;
        second2.next = third2;
        third2.next = fourth2;
        fourth2.next = five2;
        five2.next = first;

        Node intersect = findIntersect(first, first2);
        System.out.println(intersect.data);

    }

    private static class Result{
        Node tail;
        int size;
        Result(Node tail, int size){
            this.tail = tail;
            this.size = size;
        }
    }

    private static Result getTailAndSize(Node l){
        if(l==null) return null;
        int size = 1;
        Node head = l;
        while(head!=null && head.next!=null){
            size += 1;
            head = head.next;
        }
        return new Result(head, size);
    }

    private static boolean isIntersect(Node l1, Node l2){
        Node l1Current = l1;
        Node l2Current = l2;
        while(l1Current!=null && l1Current.next!=null){
            l1Current = l1Current.next;
        }

        while(l2Current!=null && l2Current.next!=null){
            l2Current = l2Current.next;
        }

        if(l1Current==l2Current){
            return true;
        }else{
            return false;
        }
    }
}
