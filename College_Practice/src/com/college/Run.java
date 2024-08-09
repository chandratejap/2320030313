package com.college;
import java.util.*;

class gs{
	private int t;
	int gett() {
		return t;
	}
	void sett(int a) {
		t=a;
	}
}

public class Run {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int []a) {
		int sum=0;
		for(int i=0;i<=a.length;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int[] c = new int[5];
		for(int i:c)
			c[i]=sc.nextInt();
		System.out.println(add(a,b));
		System.out.println(add(c));
		sc.close();
		int g = 10;
		gs s =new gs();
		s.sett(g);
		System.out.println(s.gett());
	}
}
