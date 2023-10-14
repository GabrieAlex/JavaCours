package Lesson02;

public class Statements12
{
    public static void main(String[] args) {

        int number = 14;
        boolean isPrime = true;

        for (int i = 2; i<number/2;i++) {
            if (number% i== 0) {
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println("the number "+number+ "is a prime");
        else
            System.out.println("the number "+ number +" is not prime");
        }
    }

