package com.Stackroute.SaiCharan.Abstract;

//abstract parent class
abstract class Animal{
 //abstract method
 public  void sound() {
	 System.out.println("Hey");
 }
}
//Dog class extends Animal class
public class Dog extends Animal{

 public void sound(){
	System.out.println("Woof");
 }
 public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
 }

}