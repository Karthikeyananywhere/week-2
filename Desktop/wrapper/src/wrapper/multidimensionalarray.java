package wrapper;

public class multidimensionalarray {


	public static void main(String[] args) {
		
		int [] [] ref=new int [3] [4];
		
		for (int i = 0; i < ref.length; i++) {
			for (int j = 0; j < ref.length; j++) {
				ref[i][j]=2;
			}
			
		}
		
		System.out.println(ref.length);
		
		for (int i = 0; i < ref.length; i++) {
			for (int j = 0; j < ref.length; j++) {
				System.out.println(ref[i][j]);
			}
		}
		
		
	}
	

}
