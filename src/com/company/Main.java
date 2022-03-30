package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        task1();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temperature:");
        int temperature = scanner.nextInt();
        if (temperature >=80)
        {
            System.out.println("Go to swimming");
        }
        else if ( temperature >=60 && temperature <80)
        {
            System.out.println("Play tennis");
        }
        else if (temperature >=40 && temperature <60)
        {
            System.out.println("Play golf");
        }
        else if (temperature <40)
        {
            System.out.println("Go to skii");
        }

    }
}
