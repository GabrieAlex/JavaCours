package Lesson03.Demo;

public class Demo {

    public void handlerNumbers(int [] numbers){

        System.out.println("Min numbers of the array is: "+ getMinimum(numbers));
        System.out.println("Max numbers of the array is: "+ getMaximum(numbers));
        System.out.println("Sum is: "+ getAverage(numbers));
    }

    public int getMinimum(int[] numbers){

        int min = numbers[0];
        for (int number:numbers){
            if (number<min)
                min=number;
        }
            return min;
    }
    public int getMaximum(int[] numbers){
        int max = numbers[0];
        for (int number:numbers){
            if (number>max)
                max=number;
        }
        return max;
    }
    public int getAverage(int[] numbers){
        int sum =0;
        for (int number:numbers){
            sum+=number;
        }
        return sum / numbers.length;
    }
}

