package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Boolean input = true;

		List<Yamaha> list = new ArrayList();

		list.add(new Yamaha("R15 V2", 175000.0, 149.9, "BLUE WHITE"));
		list.add(new Yamaha("R15 V3", 170000.0, 149.9, "BLUE"));
		list.add(new Yamaha("MT 15", 200000.0, 155.9, "SNOW WHITE"));
		list.add(new Yamaha("R1", 2000000.0, 999.9, "GREY WHITE"));

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("WELCOME TO KARTHIKEYAN MOTORS");

			System.out.println("1.EXPLORE THE BIKES\n2.UPDATE THE LIST\n3.MODIFICATION\n4.EXIT");

			switch (scanner.nextInt()) {

			case 1: {

				System.out.println("THE MODELS THAT ARE AVAILABLE ARE HERE...");

				for (Yamaha yamaha : list) {
					System.out.println(list.indexOf(yamaha) + " " + yamaha.getBikeName());
				}

				System.out.println("PLEASE CHOOSE THE BIKE THAT YOU WANT TO LOOK AT");

				int userInput1 = scanner.nextInt();

				System.out.println(list.get(userInput1));

				break;
			}

			case 2: {

				System.out.println("1.ADDING EXTRA BIKE DETAILS\n2.REMOVE");

				int user = scanner.nextInt();

				switch (user) {
				case 1: {

					System.out.println("ENTER HOW MANY BIKE DETAILS YOU WANT TO ADD");

					int add = scanner.nextInt();

					for (int i = 0; i < add; i++) {

						System.out.println("ENETR THE BIKE MODEL,BIKE PRICE,BIKE CC,BIKE COLOUR");

						list.add(
								new Yamaha(scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.next()));

					}

					System.out.println("ADDED SUCCESSFULLY");

					break;
				}

				case 2: {

					for (Yamaha yamaha : list) {
						System.out.println(list.indexOf(yamaha) + " " + yamaha.getBikeName());
					}

					System.out.println("PLEASE CHOOSE THE BIKE THAT YOU WANT TO REMOVE");

					int userInput2 = scanner.nextInt();

					list.remove(userInput2);

					System.out.println("REMOVED SUCCESSFFULLY");

					break;
				}

				}

				break;
			}

			case 3: {

				for (Yamaha yamaha : list) {
					System.out.println(list.indexOf(yamaha) + " " + yamaha.getBikeName());
				}

				System.out.println("PLEASE CHOOSE THE BIKE THAT YOU WANT TO EDIT");

				int userInput4 = scanner.nextInt();

				System.out.println(list.get(userInput4));

				System.out.println("CHOOSE THE DETAILS YOU WANT TO EDIT");
				System.out.println("1.BIKE NAME\n2.BIKE PRICE\n3.BIKE CC\n4.BIKE COLOUR");

				switch (scanner.nextInt()) {
				case 1: {

					System.out.println("ENTER THE BIKE NAME");

					list.get(userInput4).setBikeName(scanner.next());
					
					System.out.println("UPDATIONSUCCESSFULL");

					break;
				}

				case 2: {

					System.out.println("ENTER THE BIKE PRICE");

					list.get(userInput4).setBikePrice(scanner.nextDouble());;

					System.out.println("UPDATIONSUCCESSFULL");
					break;
				}
				
				case 3:{
					
					System.out.println("ENTER THE BIKE CC");

					list.get(userInput4).setBikeCc(scanner.nextDouble());;

					System.out.println("UPDATIONSUCCESSFULL");
					
					break;}
				
				case 4:{
					
					System.out.println("ENTER THE COLOUR");
					
					list.get(userInput4).setColour(scanner.next());
					
					System.out.println("UPDATIONSUCCESSFULL");
					break;}

				}

				break;
			}

			case 4: {

				input = false;

				break;
			}

			}

		} while (input);

	}

}