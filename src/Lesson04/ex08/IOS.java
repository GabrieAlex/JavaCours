package Lesson04.ex08;

public class IOS extends Mobile {

    double osVersion = 12.3;
    int price = 4500;

    public void callPrint (){

        System.out.println("OS Version for Iphone is: "+ osVersion);
        System.out.println("Iphone price is: "+ price);
        getLink();
    }
}
