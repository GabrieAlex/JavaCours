package Lesson05.FinalEx;

public class FinalFunction {

    //Part 1:

    public String functionReverse01 (int number){
        String temp = "";
        String sNumber = Integer.toString(number);
        String[] arr =sNumber.split("");
        for (int i=arr.length-1; i >=0 ; i--){
          temp += arr[i];
        }
        return temp;



    }
    //Part 2:

    public String fucnctionRevese02 (double number){
        String sNumber = Double.toString(number);
        String[] arr =sNumber.split("\\.");

        return arr[1]+ "." +arr[0];
    }
}
