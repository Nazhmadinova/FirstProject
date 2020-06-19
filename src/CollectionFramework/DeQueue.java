package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DeQueue {

    public static void main(String[] args) {

        Deque<Integer> de_que = new ArrayDeque<Integer>(10);
        de_que.add(90);
        de_que.add(20);
        de_que.add(30);
        de_que.add(60);
        de_que.add(50);
        System.out.println(de_que);
        System.out.println(de_que.remove());

//        de_que.addFirst(564);
//        de_que.addFirst(291);
//        System.out.println(de_que);
//        de_que.add(10);
//        de_que.add(20);
//        de_que.add(30);
//        System.out.println(de_que.add(40));
//        System.out.println(de_que);
//
//        Object[] arr = de_que.toArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(de_que.offer(90));;
//        System.out.println(de_que);
//
//        System.out.println("Head element poll : " + de_que.poll());
//
//        System.out.println(de_que.pop());;
//        de_que.push(265);
//        de_que.push(984);
//        de_que.push(2365);
//        System.out.println(de_que.peek());
//        System.out.println(de_que);

    }

}
