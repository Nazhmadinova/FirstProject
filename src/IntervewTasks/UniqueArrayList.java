package IntervewTasks;

import java.util.ArrayList;

public class UniqueArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(getUnique(list));
    }

    public static ArrayList<Integer> getUnique(ArrayList<Integer> list) {

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!unique.contains(list.get(i))) {
                unique.add(list.get(i));
            }
        }
        return unique;
    }

}
