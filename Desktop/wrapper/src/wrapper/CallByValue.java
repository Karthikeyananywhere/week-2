package wrapper;

public class CallByValue {
	
	   int a =10;
	
	int call (int a) {
		a=a+10;
		return a;
	}
	
	
	public static void main(String[] args) {
		CallByValue call=new CallByValue();
		
		System.out.println(call .a);
		
		call.a = call.call(10);
		
		System.out.println(call.a);
	}

}
