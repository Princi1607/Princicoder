package com.test.design;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Taking input fron user:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int sum =a+b;
        System.out.println("sum of numbers is:");
        System.out.println(sum);
        }

}
