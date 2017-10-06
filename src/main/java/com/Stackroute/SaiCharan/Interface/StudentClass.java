// Has-A(Aggregation)

package com.Stackroute.SaiCharan.Interface;

class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
   
}

class College
{
   String collegeName;
   //Creating HAS-A relationship with Address class
   Address collegeAddr; 
   College(String name, Address addr){
       this.collegeName = name;
       this.collegeAddr = addr;
   }
   // .....................
}
class Staff
{
   String employeeName;
   //Creating HAS-A relationship with Address class
   Address employeeAddr; 
   Staff(String name, Address addr){
       this.employeeName = name;
       this.employeeAddr = addr;
   }
  // ...................... 
}   

class StudentClass
{
   int rollNum;
   String studentName;
   //Creating HAS-A relationship with Address class
   Address studentAddr; 
   StudentClass(int roll, String name, Address addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }
   public static void main(String args[]){
       Address ad = new Address(55, "Agra", "UP", "India");
       StudentClass obj = new StudentClass(123, "Chaitanya", ad);
       System.out.println(obj.rollNum);
       System.out.println(obj.studentName);
       System.out.println(obj.studentAddr.streetNum);
       System.out.println(obj.studentAddr.city);
       System.out.println(obj.studentAddr.state);
       System.out.println(obj.studentAddr.country);
   }
}