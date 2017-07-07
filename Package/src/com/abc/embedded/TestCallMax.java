package com.abc.embedded;

import com.abc.util.Max;

public class TestCallMax{
	private int a,b;
	TestCallMax(){
		a=0;
		b=0;
	}
	
	public TestCallMax(int a,int b){
		this.a =a;
		this.b =b;
	}
	
	public void print(){
		System.out.println("a= " + a + ",b= " + b);
		System.out.println("Max= " + Max.max(a, b));
	}

}
