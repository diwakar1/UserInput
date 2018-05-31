package com.company;
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("firstInitial  "  );
        String firstInitial = keyboard.next();
        System.out.print("lastName  "  );
        String lastName = keyboard.next();
        System.out.print("houseNumber  "  );
        int houseNumber = keyboard.nextInt();
        System.out.print("streetName  "  );
        String streetName = keyboard.next();
        System.out.print("streetType  "  );
        String streetType = keyboard.next();
        System.out.print("city  "  );
        String city = keyboard.next();
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);










    }
}
