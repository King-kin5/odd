package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

            System.out.println("Enter your number");
        while (scanner.hasNextInt()){
            int enter = scanner.nextInt();
            even even = new even(enter);

            if (even.isEven()) {
                evenNumbers.add(even.getValue());
            }
            if(even.isOdd()) {
                oddNumbers.add(even.getValue());
            }
            System.out.println("Even numbers: " + evenNumbers.toString());
            System.out.println("Odd numbers:" + oddNumbers.toString());
        }
    }
}
