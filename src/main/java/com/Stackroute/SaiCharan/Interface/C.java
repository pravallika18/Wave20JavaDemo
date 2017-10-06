package com.Stackroute.SaiCharan.Interface;

// Multi-level Inheretence



class A{
	public void methodA() {
		System.out.println("In A");
	}
	public void laugh() {
		System.out.println("haha");
	}
}


class B extends A{
	public void methodB() {
		System.out.println("In B");
	}
	public void laugh() {
		System.out.println("cheese");
	}
}


public class C extends B{
	public void methodC() {
		System.out.println("In C");
	}
	public void laugh() {
		System.out.println("haha cheese");
	}
	public static void main(String[] args) {
		C c = new C();
		c.methodA();
		c.methodB();
		c.methodC();
		c.laugh();
	}

}
