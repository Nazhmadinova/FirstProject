package ArrayList;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args){
        ArrayList<String> names= new ArrayList<>();
        names.add("Jason");
        names.add("Adam");
        names.add(1,"Zhaina");
        System.out.println(names);
        System.out.println(names.get(1));

        ArrayList<Cat> catsForSale=new ArrayList<>();
        Cat cat1=new Cat();
        cat1.color="White";
        cat1.age=3;

        catsForSale.add(cat1);

        Cat cat2= new Cat();
        cat2.color="Black";
        cat2.age=1;

        catsForSale.add(cat2);
        System.out.println(catsForSale.size());
        System.out.println();

        for(int i=0;i<catsForSale.size();i++){
            System.out.println(catsForSale.get(i).age);
            System.out.println(catsForSale.get(i).color);
        }



    }
}
