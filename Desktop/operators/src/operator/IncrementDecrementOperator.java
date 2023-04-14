package operator;

import java.util.ArrayList;

public class IncrementDecrementOperator {
	
   int input;
   
   
   int input2;
   
   public static int add(int input,int input2) {
	   
	   input++; 
	   input2++;
	   
	   Integer add=input+input2;
	
	   int i = ++input + ++input2;
	   
	   return i;
   }
  
   
  public static int sub(int input,int input2) {
	   
	   input--; //-1
	   input2--; //-1
	   
	   Integer add=input--+input2--; //-1 + -1 (-2,-2)
	
	   Integer sub=input-input2; //-2+(-2)
	   
	   int i = --input + --input2; //-3+-3
	   
	   return i;
   }
  
   public static void main(String[] args) {
	int add = add(0,0);
	System.out.println(add);
	
	int sub = sub(0, 0);
	
	System.out.println(sub);
	
	String s[]= {"QWER","QWERTY","POIUY","DFGH"};
	


}
	

}
