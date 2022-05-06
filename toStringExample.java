package javaString;

public class toStringExample {

		 int rollno;  
		 String name;  
		 String city;  
		  
		 toStringExample(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
			 toStringExample s1=new toStringExample(111,"Raj","lucknow");  
			 toStringExample s2=new toStringExample(222,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  

}
