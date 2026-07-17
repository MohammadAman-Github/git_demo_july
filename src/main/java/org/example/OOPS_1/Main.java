package org.example.OOPS_1;

public class Main {

    public static void main(String[] args) // Entry point of java code
    {
        // use debugger instead of running code directly
        Students s1 = new Students();
        s1.name = "Iram";
        s1.age = 28;
        s1.psp = 98;

        s1.Print_age();
        s1.Print_name();
        s1.print_details();
        System.out.println();

        Students s2 = new Students();
        s2.name = "Aman";
        s2.age = 29;
        s2.psp = 75;

        s2.Print_age();
        s2.Print_name();
        s2.print_details();
        System.out.println();
    }

}
