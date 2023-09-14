package Lesson01;

public class DataTypesNonePrimitives01 {
    public static void main(String[] args) {
        String FirstName = "Alex";
        String LastName = "Gabriel";
        int MyAge =36;
        String FullName= FirstName+ " "+LastName;
        System.out.println(Integer.toString(MyAge));
        System.out.println("Full Name- "+FullName);
        System.out.println(FullName.toUpperCase());
        System.out.println(FullName.length());
        System.out.println(Integer.toString(MyAge).equals(FullName));


    }
}
