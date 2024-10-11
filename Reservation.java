package HotelMangement;

import java.util.Date;
import java.util.Scanner;

public class Reservation {
public static void main(String[] args) {
	Room r = new Room(50);
	Customer c = new Customer();
	Scanner sc = new Scanner(System.in);
	int choice;
	try {
	do {
		System.out.println("hotel management");
		System.out.println("1.view customer list");
		System.out.println("2. to book a room");
		System.out.println("3.to remove the reservation");
		System.out.println("4.view room avaliablity");
		System.out.println("5 display the current reservation");
		System.out.println("6. exits");
		System.out.println("enter the choice");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1: 
			c.customerlist();
			break;
		case 2:
			System.out.println("enter the numbers of rooms that you want to book");
			int roomnum = sc.nextInt();
			r.bookroom(roomnum);
			break;
		case 3:
			System.out.println("enter the number of rooms count that you want to remove");
			int roomnum2 = sc.nextInt();
			r.removebookorder(roomnum2);
			break;
		case 4:
			System.out.println("total rooms avaliable");
			r.viewavaliablity();
			break;
		case 5:
			System.out.println("The current reservation in hotel");
			r.viewavaliablity();
			break;
		case 6: 
			System.out.println("you exit the system");
			
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	} while (choice != 6);
	
} catch(Exception e)
	{
	System.out.println("illigle type");
	}

}
}
