package basic;

public class CheckedExceptionPropagation {

	public static void main(String[] args) {

		try {
			trial();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static void trial() throws InterruptedException  {

		char ch = 'A';
		for (int i = 0; i < 10; i++) {

			System.out.println(ch);

			Thread.sleep(1000);
			ch++;

		}
	}

}
