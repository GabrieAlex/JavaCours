package Lesson02;

public class Statements07
{
    public static void main(String[] args)
    {
        String [][] array = new String[2][3];
        array [0][0]  = "Moshe";
        array [0][1] = "22";
        array [0][2] = "Jerusalem";
        array [1][0] = "Joseph";
        array [1][1] = "45";
        array [1][2] = "London";

        for (int i =0 ; i <2 ;i++){
            for (int j=0;j<3;j++)
                System.out.println(array[i][j]);

        }
    }
}
