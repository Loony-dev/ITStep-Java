package com.loonydev;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner mScanner;

    public static void main(String[] args) {
        mScanner = new Scanner(System.in);

        System.out.println("Enter task id:\n1 - Numeral Systems Converter\n2 - Array\n3 - Math(random)\n4 - Wrapper");

        switch (mScanner.nextInt()) {
            case 1: NumSys(); break;
            case 2: Array(); break;
            case 3: MathRandom(); break;
            case 4: Wrapper(); break;
            default:
                System.out.println("Error: Invalid task id");
        }
    }

    private static void NumSys() {
        System.out.println("\n1. Numeral Systems Converter");

        String tmp;

        int num;

        int currentNumSys;
        int newNumSys;

        while (true) {
            System.out.print("Enter original number: ");
            tmp = mScanner.next().toLowerCase();
            if (tmp.charAt(0) == 'q')
                break;
            else num = Integer.parseInt(tmp);

            System.out.print("Current number system(2, 8, 10, 16): ");
            tmp = mScanner.next().toLowerCase();
            if (tmp.charAt(0) == 'q')
                break;
            else currentNumSys = Integer.parseInt(tmp);

            System.out.print("New number system(2, 8, 10, 16): ");
            tmp = mScanner.next().toLowerCase();
            if (tmp.charAt(0) == 'q')
                break;
            else newNumSys = Integer.parseInt(tmp);


        }
    }

    private static void Array() {
        System.out.println("\n2. Array");

        int[] numbers = new int[16];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = (int) Math.pow(2, 15 - i);

        System.out.print("Result: ");
        for (int num : numbers)
            System.out.print(num + ", ");

        Arrays.sort(numbers);

        System.out.print("\nSorted result: ");
        for (int num : numbers)
            System.out.print(num + ", ");
    }

    private static void MathRandom() {
        System.out.println("\n4. Math(random)");

        int[] numbers;

        int max;
        int min;

        System.out.print("Enter array length: ");
        numbers = new int[mScanner.nextInt()];

        System.out.print("Enter the min random number: ");
        min = mScanner.nextInt();

        System.out.print("Enter the max random number: ");
        max = mScanner.nextInt();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = (int)(Math.random() * (max - min + 1) + min);

        System.out.print("Result: ");
        for (int num : numbers)
            System.out.print(num + ", ");
    }

    private static void Wrapper() {
        System.out.println("\n3. Wrapper");

        char[] chars = new char[0];
        char symbol;

        int charsCount = 0;

        while ((symbol = mScanner.next().charAt(0)) != '/') {
            chars = Arrays.copyOf(chars, chars.length + 1);
            chars[chars.length - 1] = symbol;

            charsCount++;
        }

        System.out.println(chars);
        System.out.println("Array length: " + chars.length + "\t" + "Number of entered chars: " + charsCount);
    }
}
