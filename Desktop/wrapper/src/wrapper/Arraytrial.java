package wrapper;

import java.util.Scanner;

public class Arraytrial {

	//static way array creation
	static Character input []= {'A','B','C','D','E'};
	
	//Dynamic way array creation
	static char ch []=new char [5];
	

	static char c='Z';	
	
	public static void main(String[] args) {
		
		for (int i=0; i < ch.length; i++) {
			
			
			ch[i]=c;
			c--;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			
			System.out.println(input[i]);
		}
	}
	
	

}
