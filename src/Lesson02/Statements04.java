package Lesson02;

public class Statements04 {
    public static void main(String[] args) {
        String countries[] = {"Austria", "Germany", "Canada", "Peru", "Israel"};

        //Part A:
        for (String country : countries)
            System.out.println(country);

        //Part B:

        for (String country :countries){
            if (country.equals("Israel"))
                System.out.println(country);
        }

        //Part C:
        if (countries [2].equals("China"))
            System.out.println("Yes it is there");
        else
            System.out.println("No sorry...");

        //Part D:
        System.out.println(countries[0].length());

    }
    }

