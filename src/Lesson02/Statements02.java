package Lesson02;

public class Statements02 {
    public static void main(String[] args)
    {
        int [] numbers= {2,5,9};

        if (numbers[0]>numbers[1])
        System.out.println("First one is bigger");

        else if (numbers[1]>numbers[0])
            System.out.println("Second is bigger");
        else
            System.out.println("Both are equal");

    }
}
