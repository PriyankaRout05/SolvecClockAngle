package com.anglequestion;

import java.util.Scanner;

public class Clock {
	
	public static void main(String args[]) {
		
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the hour");
	int hr=scn.nextInt();
	System.out.println("Enter the minutes");
	int min=scn.nextInt();
	
	
	double Hangle=(hr*30+min)*0.5;
	double Minangle=min*6;
	double result=0.0;
	
	 if(Hangle>Minangle) {
		 result=Hangle-Minangle;
	 }
	 else {
		 result=Minangle-Hangle;
	 }
	 if(result>180) {
		System.out.println("the least angle is " +(360-result));
	 }else {
		 System.out.println("the angle is"+result);
		
		 
	 
		 
	 }
		 

	
	
		
	}

}
