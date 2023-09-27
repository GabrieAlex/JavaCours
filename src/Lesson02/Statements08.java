package Lesson02;

public class Statements08 {
    public static void main(String[] args) {
        int numbers [] ={1,2,3,4,5,6};

        for (int i=0 ; i<numbers.length; i++) {

            if (numbers[i] % 2 == 0)
                System.out.println(numbers[i]);
        }
    }
}
