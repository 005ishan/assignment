package Assignment;
// 9.	Write a program that prompts the user to enter five integer values and reads them into an array. The program should consist of the following methods:
//  	a method named "max" that reads an array of integer values and returns the maximum value   a method named "indexOfHighest" that returns the index of the highest element in an array of integers. If more than one such element exists, return the smallest index. Invoke the above methods and demonstrate them in the program.

import java.util.Scanner;

public class task9 {
    static int[] numbers = new int[5];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number" + (i + 1));
            int number = scan.nextInt();
            numbers[i] = number;
        }

        // Displaying the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(max());
        System.out.println(indexOfHighest());

    }

    // maximum value
    static int max() {

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;

    }

    static int indexOfHighest() {
        int max = numbers[0];
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }

            else if (numbers[i] == max) {
                index = -1;
            }

        }
        return index;
    }

}