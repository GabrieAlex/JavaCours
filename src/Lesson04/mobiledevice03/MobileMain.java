package Lesson04.mobiledevice03;

public class MobileMain {
    public static void main(String[] args) {
        MobileDevice device1= new MobileDevice("Iphone",'I', 10.2,true,4300,6,10);
        device1.PrintParamaters();
        System.out.println("area: "+ device1.calculateArea());
        device1.pictureQuality();

        MobileDevice device2 = new MobileDevice("Samsung",'A',2.5, false, 250, 120,2740);
        device2.PrintParamaters();
        System.out.println("area: "+ device2.calculateArea());
        device2.pictureQuality();


    }
}
