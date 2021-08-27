package Chapter2;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.awt.desktop.SystemSleepEvent;

public class returnKthToLast {

    static Node kthToLast(Node head, int k){
        Node current = head;
        Node runner = current;
        int cnt = 0;
        int runTimes = 0;
        while(runner.next != null){
            cnt = 0;
            while(cnt<k && runner.next != null){
                runner = runner.next;
                cnt += 1;
            }
            runTimes +=1;
        }
        int totalCnt = (runTimes-1)*k-(k-cnt);
        while(totalCnt>=0){
            current = current.next;
            totalCnt -= 1;
        }
        return current;
    }

    static int kthToListS2(Node head, int k){
        if(head == null){
            return 0;
        }
        int i = kthToListS2(head.next,k) + 1;
        if(i==k){
            System.out.println("the " + k + "th element is " + head.data);
        }
        return i;
    }

    static Node kthToListS3(Node head, int k){
        if(k<=0) return  null;
        Node p1 = head;
        Node p2 = head;
        for(int i = 0;i < k-1;i++){
            if(p2==null) return null;
            p2 = p2.next;
        }
        if(p2==null) return  null;

        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void  main(String[] args){
        Node head = new Node(1);
        LinkedList linkedList = new LinkedList(head);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.insert(9);
        linkedList.insert(10);
        linkedList.insert(11);
        linkedList.insert(12);

        int k = 5;
        Node kth = kthToLast(head, k);
        System.out.println(kth.data);
//        System.out.println(kth.next.data);

        kthToListS2(head, k);
        Node s3= kthToListS3(head, k);
        System.out.println(s3.data);
    }
}
