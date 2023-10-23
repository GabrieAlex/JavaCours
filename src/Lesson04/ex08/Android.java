package Lesson04.ex08;

public class Android extends Mobile {

    double osVersion = 15.0;
    int price = 3500;

    public void callPrint (){

        System.out.println("OS Version for Samsung is: "+ osVersion);
        System.out.println("Samsung price is: "+ price);
        getLink();
    }
}
