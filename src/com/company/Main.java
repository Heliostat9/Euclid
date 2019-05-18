

package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your first number: ");
        int number_1 = in.nextInt();
        System.out.print("Input your second number: ");
        int number_2 = in.nextInt();
        int r;
        if (number_2 > number_1) {
            r = number_1;
            number_1 = number_2;
            number_2 = r;
        }

        r = number_1 % number_2;
        if (r == 0) {
            System.out.println(number_2);
        } else {
            while(r != 0) {
                number_1 = number_2;
                number_2 = r;
                r = number_1 % r;
            }

            System.out.println(number_2);
        }

    }
}
