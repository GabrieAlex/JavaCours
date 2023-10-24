package Lesson05;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {


        //Part 1:

        List<String> countries = new ArrayList<String>();
        countries.add("Berlin");
        countries.add("Thailand");
        countries.add("Greece");
        countries.add("Philippines");
        //countries.set(0,"USA");
        //Part 2:

        System.out.println("Print all countries ");
        for (String country:countries)
            System.out.println(country);
        System.out.println("\n---------");

        //PArt 3:
        System.out.println("Number of countries is :" +countries.size());
        System.out.println("\n---------");
        //Part 4:
        System.out.println("Replace country to : ");
        countries.set(0,"USA");
        for (String country:countries)
            System.out.println(country);
        System.out.println("\n---------");

        //Part 5 :
        System.out.println("Check if Germany is in the list");
        if (countries.contains("Germany"))
            System.out.println(countries.indexOf("Germany"));
        else
            System.out.println("No Germany");
        System.out.println("\n---------");

        //Part 6:

        System.out.println("Last country is: ");
        System.out.println(countries.get(countries.size()-1));
        System.out.println("\n---------");

        //Part 7:
        System.out.println("Old countries + New countries");

        List <String> newCountries = new ArrayList<String>();
        newCountries.add("Japan");
        newCountries.add("China");
        countries.addAll(newCountries);

        for (String country :countries)
            System.out.println(country);

    }
}
