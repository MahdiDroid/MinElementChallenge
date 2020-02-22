package com.company;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of digits that you want to add");
        int scope = scanner.nextInt();
        var numbers = new int[scope];
        for (int i=0; i<scope; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println(findMin(numbers));

    }


    public static int findMin(int[] numbers){
        int min = 0;
        min = numbers[0];
        for (int i=0; i<numbers.length -1; i++) {
            ;
            if (min > numbers[i + 1]) {
                min = numbers[i + 1];
            }
        }
        return min;
    }
}
