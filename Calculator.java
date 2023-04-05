package com.test.design;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Please enter the marks of all the five subjects out of hundred:");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the marks of first subject:");
        float sub1=sc.nextFloat();
        System.out.println("enter the marks of the second subject:");
        float sub2=sc.nextFloat();
        System.out.println("enter the marks of the third subject:");
        float sub3=sc.nextFloat();
        System.out.println("enter the marks of the fourth subject:");
        float sub4=sc.nextFloat();
        System.out.println("enter the marks of the fifth subject:");
        float sub5=sc.nextFloat();
        float sum=sub1+sub2+sub3+sub4+sub5;
        float percentage=(sum/500)*100;
        System.out.println("The percentage obtained by the student is:");
        System.out.println(percentage);
        }

}
