package wrapper;

public class Dynamicarray2d {
	
	public static void main(String[] args) {
		int [] [] ref= {{1,2,3},{5,6,7,8},{4,5,6,7,8}};
		
		for (int i = 0; i < ref.length; i++) {
			for (int j = 0; j < ref[i].length; j++) {
				System.out.println(ref[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
