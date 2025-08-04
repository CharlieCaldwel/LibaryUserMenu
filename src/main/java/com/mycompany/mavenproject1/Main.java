package com.mycompany.mavenproject1;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)){
        
        String option = "0";
    
        System.out.println("Hello what would you like to do? ");
        System.out.println("1. Borrow a book");
        System.out.println("2. Return a book");
        System.out.println("3. Check outstanding fees");
        System.out.println("4. Current books");
        System.out.println("5. View Profile");
        System.out.println("6. Logout");
        
        while (!option.equals ("6")){
            
            System.out.print("Enter option number: ");
            option = scan.nextLine();
            
            switch (option){
            
                case "1":
                    System.out.println("Book options: ");
                    break;
                
                case "2":
                    System.out.println("Return options: ");
                    break;
                
                case "3":
                    System.out.println("Fees due: ");
                    break;
                
                case "4":
                    System.out.println("Books currently borrowed: ");
                        break;

                case "5":
                    System.out.println("Name: ");
                    System.out.println("Libary ID: ");
                    break;
                
                case "6":
                    System.out.println("Logging out... ");
                    break;
                
                default:
                    System.out.println("Invalid input");                     
            } 
        }    
    }    
}
}
