package HotelMangement;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
int customerid;
String custormname;
String contactnumber; 

ArrayList<String> a = new ArrayList<String>();
//to add the values in arraylist

public Customer()
{
	a.add("1. customer1");
	a.add("2. customer2");
	a.add("3. customer3");
}

// to view the customer list
public void customerlist()
{
	for(String s : a )
	{
		System.out.println(s);
	}
}
}

