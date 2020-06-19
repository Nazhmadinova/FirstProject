package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(80);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(30);
        pQueue.add(90);
        pQueue.add(3);


        // removes in sorted order
        System.out.println(pQueue);
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.element());
        System.out.println(pQueue.remove());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.remove());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
//        System.out.println(pQueue.peek());
//        System.out.println(pQueue.element());
//
//        Iterator it = pQueue.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println(pQueue);

    }

}
