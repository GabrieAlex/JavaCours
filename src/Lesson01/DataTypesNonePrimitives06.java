package Lesson01;

public class DataTypesNonePrimitives06 {
    public static void main(String[] args) {

        //Part a
        String BonJovi= "Shout trough the heart and you're to blame darling you give love a bad name";
        System.out.println(BonJovi.replaceAll(" ",""));

        //Part b
        String[] array = BonJovi.split(" ");
        System.out.println(array.length);

        //Part c option 1
        String firstWord =array[0];
        int len =array.length;
        String lastWord = array[len-1];
        System.out.println(firstWord+" "+ lastWord);

        //Option 2
        System.out.println(array[0]+ " "+ array[array.length-1]);
    }
}
