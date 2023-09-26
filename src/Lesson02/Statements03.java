package Lesson02;

public class Statements03
{
    public static void main(String[] args)
    {
        //Part A
        for (int i =1;i<=10;i++)
        System.out.println(i);

        // Part B
        int x =1;
        while (x<=10) {
            System.out.println(x);
            x++;
        }

        //Part C

        for (int n=30;n<=50;n++)
        {
        if (n%2==0)
            System.out.println(n);
        }
        //Part D

        for (int i=20;i<=40;i++)
        {
            if (i%2!=0)
                System.out.println(i);
        }
    }
}
