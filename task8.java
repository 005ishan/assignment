package Assignment;
// 8.	Design and implement a simple Java application that prompts the user to enter a valid email address. Your application should throw and handle a custom exception if the user enters an invalid email address.
//  	InvalidEmailException:
//  	A custom exception that is thrown when the user enters an email address that does not match a valid email pattern (e.g., it should contain '@' and '.' characters).

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
    System.out.println("Enter an email: ");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();


        
            if(email.contains("@")&&email.contains(".")){
                System.out.print("Valid email: ");
                System.out.print(email);
            }
        
        else{
            throw new ArrayIndexOutOfBoundsException("Email should contain @ and . symbols");
        }
        
    }
}