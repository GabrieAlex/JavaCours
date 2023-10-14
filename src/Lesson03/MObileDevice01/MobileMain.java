package Lesson03.MObileDevice01;

import Lesson03.MObileDevice01.MobileDevice;

public class MobileMain {
    public static void main(String[] args) {
        MobileDevice device1= new MobileDevice();
        device1.model="Iphone";
        device1.os = 'I';
        device1.version= 10.2;
        device1.hasflash=true;
        device1.price= 4300;
        device1.screenHeight =1230;
        device1.screenWidth =270;
        device1.PrintParamaters();

        System.out.println("area: "+ device1.calculateArea());
        device1.pictureQuality();

        MobileDevice device2 = new MobileDevice();
        device2.model = "iPhone X";
        device2.os = 'I';
        device2.version = 14.2;
        device2.hasFlash =false;
        device2.price = 4500;
        device1.screenHeight =120;
        device1.screenWidth =2740;
        device2.PrintParamaters();

        System.out.println("area: "+ device2.calculateArea());
        device2.pictureQuality();


    }
}
