package Lesson03;

public class ExpactionHandaling {
    public static void main(String[] args) {

        String temp = "NA";
        String array []= {"hellow","World"};

        try {
            temp = array[4];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array of 4th index is: "+ temp);
        }
        }

}
