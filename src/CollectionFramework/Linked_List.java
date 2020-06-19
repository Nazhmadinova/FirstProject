package CollectionFramework;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<String>();
// Add method:
        //Adding elements to the Linked list
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("Negan");

        //Adding an element to the last position
        list.addLast("Rick");

        //Adding an element to the 3rd position
        list.add(2, "Glenn");

        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list);

        List<String> list2 = new LinkedList<String>();
        list2.add(0,"Aaa");

        Deque<String> list3 = new LinkedList<String>();
       // list3.add(1,""); // doesn't compile, Deque doesn't have this method

 // Remove method:

        //Removing First element
        //Same as list.remove(0);
        list.removeFirst();

        //Removing Last element
        list.removeLast();

        //removing 2nd element, index starts with 0
        list.remove(1);

        list.remove("Steve");

        System.out.println(list);


        System.out.println(list.get(0));
        System.out.println(list);

        list.set(0, "Hi");

        System.out.println(list);
    }

}
