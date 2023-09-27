package Lesson02;

public class Statements06 {
    public static void main(String[] args)
    {

        String occupation = "isi";
        int salary;

        switch (occupation) {

            case "Teacher": {
                salary = 5000;
                break;
            }
            case "Bank teller": {
                salary = 10000;
                break;
            }
            case "QA": {
                salary = 15000;
                break;
            }
            default:
                salary = 9100;
        }
        System.out.println("salary of " +occupation + " is " + salary);

    }
}
