package main.java;

import java.util.Scanner;

public class ScannerExercise {

    public static void main(String[] args) {

        // Write an application that takes all the information about a specific user

        Scanner applic = new Scanner(System.in);

        String name;
        int age;
        String gender;
        String education;
        String email;
        String profession;
        String company;

        System.out.println("Please enter your information to built your CV: ");
        System.out.println("Please enter your name");
        name = applic.nextLine();

        System.out.println("Please enter your age");
        age = applic.nextInt();

        System.out.println("Please enter your gender - maskulin, feminin or diverse");
        gender = applic.next();
        applic.nextLine(); //avoiding to skip the next input education

        System.out.println("Please enter your education");
         education = applic.nextLine();

        System.out.println("Please enter your email");
        email = applic.nextLine();

        System.out.println("Please enter your profession");
        profession = applic.nextLine();

        System.out.println("Please enter the company");
        company = applic.nextLine();

        System.out.println("Hello, \nMy name is "+ name + " and I`m "+ age +" years old. I´m " +gender +" and my education is " +education +
                        ". My Profession is "+profession+ " and I`m working for "+company +".\nYou can reach me via email "+ email +". \nThank you in advance. \nKind regards\n"+name);

    }
}
