package Abstraction.Interface;

import Constructor.Item;

public interface GoodFood extends Food, Eatable {

    void getFood();

    int num = 9;
    static int staticMethod(){
        return num;
    }



}
