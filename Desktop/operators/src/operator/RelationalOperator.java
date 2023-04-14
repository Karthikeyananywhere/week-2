package operator;

import java.util.Scanner;

public class RelationalOperator {
	
	public static void main(String[] args) {
		
		Boolean result1=true;
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("ENTER THE FIRST NUMBER");
		Integer input1=scan.nextInt();
		
		System.out.println("ENTER THE SECOND NUMBER");
		Integer input2=scan.nextInt();
		
		System.out.println("SELECT THE OPERATION U WANT TO PERFORM");
		System.out.println("1.IS FIRST NUMBER GREATER\n2.IS SECOND NUMBER GREATER\n3.IS BOTH ARE EQUAL\n4.IS BOTH ARE DIFFERENT NUMBERS\n5.EXIT");
		
		do {
			
			switch (scan.nextInt()) {
			case 1:{
				
				Boolean result=input1>input2;
			System.out.println("IS NUMBER GREATER "+result);
					break;}

			case 2:{
				
				Boolean result=input1<input2;
				
				System.out.println("IS SECOND NUMBER GREATER "+result);
				
				break;}
			case 3:{
				
				Boolean result=input1==input2;
				
				System.out.println("IS BOTH ARE EQUAL "+result);
				
				break;}
			
			case 4:{
				Boolean result=input1!=input2;
				
				System.out.println("ARE BOTH ARE DIFFERENT NUMBERS "+result);
				break;}
			
			case 5:{
				result1=false;
				break;}
			}

			
		}while (result1);
		
		
			
		
 	}

}