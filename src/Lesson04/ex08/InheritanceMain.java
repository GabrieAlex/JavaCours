package Lesson04.ex08;

public class InheritanceMain {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.callPrint();

        IE explorer = new IE();
        explorer.callPrint();

        Android samsung = new Android();
        samsung.callPrint();

        IOS iphone = new IOS();
        iphone.callPrint();

        Desktop desktop = new Desktop();
        desktop.getLink();
    }
}
