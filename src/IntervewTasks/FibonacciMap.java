package IntervewTasks;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMap {

    public static int fib(int n){
        int sLast = 0;
        int last = 1;
        int pos = 2;

        Map <Integer, Integer> map = new HashMap<>();

        while (pos <= n){

            int next = sLast + last;
            map.put(pos, next);
            sLast = last;
            last = next;
            pos++;
        }

        return map.get(n);
    }

    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n-2) + fibonacci(n-1);
    }

}
