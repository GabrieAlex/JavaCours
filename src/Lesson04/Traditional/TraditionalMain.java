package Lesson04.Traditional;

public class TraditionalMain {
    public static void main(String[] args) {

        Israel Is = new Israel();
        USA US = new USA();
        China Ch = new China();

        System.out.println("Traditional food for Israel is: " +Is.myTraditinaolFood());
        System.out.println("Traditional vacation for Israel is: " +Is.myTradionalVaction());
        System.out.println("Traditional language for Israel is: " +Is.myTradionalLangauge());


        System.out.println("Traditional food for USA: is " +US.myTraditinaolFood());
        System.out.println("Traditional vacation for USA is: " +US.myTradionalVaction());
        System.out.println("Traditional language for USA is: " +US.myTradionalLangauge());

        System.out.println("Traditional food for China is: " +Ch.myTraditinaolFood());
        System.out.println("Traditional vacation for China is: " +Ch.myTradionalVaction());
        System.out.println("Traditional language for China is: " +Ch.myTradionalLangauge());
    }
}
