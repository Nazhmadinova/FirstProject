package CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayToQueue {
    public static void main(String[] args) {
        String nums[] = {"one","two","three","four","five"};
        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue, nums);
        System.out.println(queue);

        // queue to array
        Queue<String> queue2 = new LinkedList<>();
        queue2.add("one");
        queue2.add("two");
        queue2.add("three");
        queue2.add("four");
        queue2.add("five");

        String strArray[] = queue2.toArray(new String[queue2.size()]);
        System.out.println(Arrays.toString(strArray));

        BlockingQueue<String> queueBlock = new ArrayBlockingQueue<>(2);

        System.out.println(queueBlock.add("one"));
        System.out.println(queueBlock.add("two"));
        System.out.println(queueBlock);
        System.out.println(queueBlock.offer("hello"));
        System.out.println(queueBlock.add("three"));
        System.out.println(queueBlock);
    }
}
