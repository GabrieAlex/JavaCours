package Lesson01;

import java.sql.SQLOutput;

public class DataTypesNonePrimitives05 {
    public static void main(String[] args) {
        String [] sentence = {"Java", "is ", "a ","general ","purpose ","computer ", "programming ","language "};
        //wrong option
        //System.out.println(sentence[5]+sentence[6]+sentence[7]);
        // better option
        int size= sentence.length;
        System.out.println(sentence[size-3]+" "+ sentence[size-2]+" "+sentence[size-1]);

        String Fullsentence ="Java is a general purpose computer programming language";
        String [] words = Fullsentence.split(" ");
        int len = words.length;
        System.out.println(words[len-3]+" "+words[len-2]+ " "+words[len-1]);
        //System.out.println(sentence[5]);
        //System.out.println(sentence[6]);
        //System.out.println(sentence[7]);


    }
}
