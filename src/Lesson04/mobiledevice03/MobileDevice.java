package Lesson04.mobiledevice03;

public class MobileDevice {
    //public boolean hasFlash;
   private String model;
   private char os;
   private double version;
   private boolean hasflash;
   private int price,screenWidth,screenHeight;

    public MobileDevice(String model,char os,double version,boolean hasflash, int price,int screenHeight, int screenWidth){


        this.model =model;
        this.os = os;
        this.version =version;
        this.hasflash = hasflash;
        this.price = price;

        if (screenWidth > 0)
            this.screenWidth = screenWidth;
        else
            throw new RuntimeException ("Wrong width");
        if (screenHeight > 0)
            this.screenHeight = screenHeight;
        else
            throw new RuntimeException("Wrong heihgt");


    }
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
