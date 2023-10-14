package Lesson03.MObileDevice01;

public class MobileDevice {

    public boolean hasFlash;
    String model;
    char os;
    double version;
    boolean hasflash;
    int price;

    int screenWidth;
    int screenHeight;

     public void PrintParamaters(){
         System.out.println("model: "+ model);
         System.out.println("OS: " +os);
         System.out.println("Version :"+ version);
         System.out.println("Has flash: " + hasflash);
         System.out.println("Price: " + price);
     }

     public int calculateArea(){
         return screenWidth*screenHeight;


    }
    public void pictureQuality(){
         if (hasflash){
             System.out.println("Good Quality");
         }
         else
             System.out.println("Bad Quality");
    }
}
