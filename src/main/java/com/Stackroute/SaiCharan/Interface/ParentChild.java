// disp Method Over-riding

package com.Stackroute.SaiCharan.Interface;

class ParentClass{
	   //Parent class constructor
	   ParentClass(){
		System.out.println("Constructor of Parent");
	   }
	   void disp() {
		   System.out.println("Parent Display");
	   }
	}
public class ParentChild extends ParentClass{
	   
	ParentChild(){
		System.out.println("Constructor of Child");
	   }
	void disp() {
		System.out.println("Child Display");
		super.disp();
	}
	
	   public static void main(String args[]){
		//Creating the object of child class
		ParentChild pc = new ParentChild();
		pc.disp();
	   }
	}