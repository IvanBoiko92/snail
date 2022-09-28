package com.epam.rd.autotasks.snail;
import java.util.Scanner;
public class Snail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int i = 0;
        if (h<=a) {
            System.out.println("1");
        }
        else if (a <= b) {
            System.out.println("Impossible");
        }
        else {
            while (h >= a) {
                i = i + 1;
                h = h - a;
                h = h + b;
            }
            System.out.println(i);
        }
    }
}
