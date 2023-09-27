package Lesson02;

public class Statements09 {
    public static void main(String[] args) {
        int numbers [] ={5,10,15,20,25,30};

        for (int i=0 ; i<numbers.length; i++) {

            if (numbers[i] % 3 == 0&& numbers[i] % 5==0)
                System.out.println(numbers[i]);
        }
    }
}
