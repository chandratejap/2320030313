package com.college;

class Singleton{
	private static Singleton a=null;
	private int b;
	Singleton(){
		b=20;
	}
	int geta() {
		return b;
	}
	public static Singleton getinst() {
		if(a==null) {
			a=new Singleton();
		}
		return a;
	}
}

public class main {
	public static void main(String []args) {
		Singleton s = Singleton.getinst();
		System.out.println(s.geta());
	}
}
