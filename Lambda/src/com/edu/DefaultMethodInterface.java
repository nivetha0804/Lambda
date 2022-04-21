package com.edu;
//java 8 feature default and static method in interface


interface calulation{
	void add(int a, int b);
	 default void mult(int a, int b) {
		int m=a*b;
		System.out.println("Calulations PRODUCT="+m);
		
	}
	 static void sub(int a, int b) {
		 int ans=a-b;
		 System.out.println("DIFFERNECE="+ans);
		 
	 }
}

interface MyUpdateCalulations{
	default void mult(int a, int b) {
		int m=a*b;
		System.out.println("MyUpdateCalulations PRODUCT="+m);
		
	}
	void myfunct();
}

public class DefaultMethodInterface implements calulation,MyUpdateCalulations {
	@Override
	public void add(int a, int b) {
		int s=a+b;
		System.out.println("SUM="+s);
		
	}
	@Override
	public void myfunct() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mult(int a, int b) {
		calulation.super.mult(a, b);
		MyUpdateCalulations.super.mult(7, 9);
	}
	public static void main(String[] args) {
		DefaultMethodInterface8 ob=new DefaultMethodInterface8();
		ob.add(4, 6);
		ob.mult(8, 6);
		Calulations.sub(8,2);
}
	
}

