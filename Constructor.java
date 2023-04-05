package com.test.design;
class TestCons{

public  TestCons(){
	System.out.println("Hi from Constructor Body");

	
}
public  TestCons(int a ,int b) {
	int c=a+b;
	System.out.println(c);
	
}
}

public class Constructor {

	public static void main(String[] args) {
		new TestCons(12,13);

	}

}
