package com.companyname.projectname.modulename.rough;

public class Students implements Cloneable {

	int rollno;  
	String name;  
	  
	Students(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{
	return super.clone();  
	}
	
	public static void main(String args[]){  
		try{  
			Students s1 = new Students(101,"amit");  
		  
			Students s2 = (Students) s1.clone();  
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		  
		}catch(CloneNotSupportedException c){} 
		
	
		  
		} 
	
	int a = 10;
	
	Integer i = Integer.valueOf(a);
	
	int b = i.intValue();
	

	}
