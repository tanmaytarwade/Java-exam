package HotelMangement;
import java.util.Date;
import java.util.Date.*;

public class Room {

int roomid;
final int pricepernight = 500;
int availablity;



public Room(int availablity) {

	this.availablity = availablity;
}


//to view the room avaliablity
public void viewavaliablity()
{
	System.out.println("total rooms will be  avaliable"  + " "+  availablity);
}


//to book a room

public void bookroom(int numbersofroom)
{
Date d = new Date();
	if(numbersofroom <=availablity)
	{
		availablity -= numbersofroom;
		System.out.println(numbersofroom + " "+ "will be books");
		System.out.println("===========");
		System.out.println("per room price will be 500");
		
		System.out.println(" the date on which day you want to book the room " + d);
		
		System.out.println("total cost");
		int totalcost = numbersofroom * pricepernight;
		System.out.println("the total cost of the rooms are " + " " + totalcost);
		
	}
}

// to remove the bookorder
public void removebookorder(int numberofroom)
{
	Date d = new Date();
	if(numberofroom <= availablity)
	{
		availablity = availablity + numberofroom;
		System.out.println(numberofroom +" " +"will be remove the order");
		System.out.println("on that date you will checkout" + d);
	}
}




}
