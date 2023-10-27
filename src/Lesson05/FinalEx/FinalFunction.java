package Lesson05.FinalEx;

public class FinalFunction {

    //Part 1:

    public String functionReverse (int number){
        String temp = "";
        String sNumber = Integer.toString(number);
        String[] arr =sNumber.split("");
        for (int i=arr.length-1; i >=0 ; i--){
          temp += arr[i];
        }
        return temp;
    }
}
