package wrapper;

public class Wrappertrial {

	static {
		
		System.out.println("FROM STATIC BLOCK");
	}
	

	
	int input=3;
	
	Integer obj=Integer.valueOf(input); //primitive to obj
	
	int input2=obj.intValue();//unboxing
	
	double decimal=2.0;
	
	Double obj1=Double.valueOf(decimal); //primitive to obj
	
	Float float1= 3.0f; //autoboxing
	
	float f1=float1; //autounboxing
	
	public static void calculation (Integer obj,int input,int input2,Double obj1,Float float1,float f1) {
		
		Double result=obj+input+input2+obj1+float1+f1;
		
		System.out.println("CUMMULATIVE ADDITION IS "+result);
	}
	
	static {
		System.out.println("CALLING THE METHOD calculation ");
		calculation(12, 1, 2, 2.0, 0.0f, 3.0f);
	}
	
	


	@Override
	public String toString() {
		return "Wrappertrial [input=" + input + ", obj=" + obj + ", input2=" + input2 + ", decimal=" + decimal
				+ ", obj1=" + obj1 + ", float1=" + float1 + ", f1=" + f1 + "]";
	}






	public static void main(String[] args) {
		Wrappertrial wrappertrial=new Wrappertrial ();
		
		System.out.println(wrappertrial);
	}
	
}
