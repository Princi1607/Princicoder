package com.test.design;

import java.util.Scanner;


public class Classesinjava {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int num=sc.nextInt();
		if(num==1) {
			Factorialtest xyz=new Factorialtest();
			xyz.testfactorial();
		}
		else if(num==2) {
			Evenoddtest abc=new Evenoddtest();
			abc.testevenodd();
		}
		else {
			Primetest pqr=new Primetest();
			pqr.testprime();
		}
	}

}

class Factorialtest{
	public void testfactorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int a=1;
		for(int i=1;i<=num;i++) {
			a=a*i;
			System.out.println(a+" ");
		}
	}
}


class Evenoddtest{
	public void testevenodd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}


class Primetest{
	public void testprime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int num=sc.nextInt();
		boolean test=false;
		if(num==2)
			test=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				test=false;
				break;
			}
			else {
				test=true;
			}
		}
		if(test==true)
			System.out.println("Prime");
		else if(test==false) {
			System.out.println("Not prime");
		}
	}
}

