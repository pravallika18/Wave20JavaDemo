// Reusability of code

package com.Stackroute.SaiCharan.Interface;

class Teacher{
	
	String designation = "Mentor";
	String college = "StackRoute.";
	public void teach() {
		System.out.println(" Hey I Teach!!");
	}
	
	public String toString() {
		return designation+" in "+college;
	}
	
}

class MathsTeacher extends Teacher{
	String subject = "Maths ";
}

public class ScienceTeacher extends Teacher {
	
	String subject = "Science ";
	public static void main(String[] args) {
		
		ScienceTeacher st = new ScienceTeacher();
		System.out.print(st.subject+st.toString());
		st.teach();
		
		MathsTeacher mt = new MathsTeacher();
		System.out.print(mt.subject+mt.toString());
		mt.teach();
	}

}

