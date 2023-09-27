package travelagencyapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Travel {

	public boolean isCarDriver(Driver drive) throws DriverException {

		if (drive.category.equalsIgnoreCase("car")) {

			System.out.println(drive.driverName + " is car driver ");

			return true;
		}

		else {

			throw new DriverException(drive.driverName + " is not a car driver");
		}

	}

	public String retrieveByDriverId(ArrayList<Driver> al, int id) {

		Iterator<Driver> i = al.iterator();
		
		String string="";

		while(i.hasNext()) {

			Driver d = (Driver) i.next();

			if (d.driverId == id) {

				 string= "Driver name is " + d.driverName + " Belonging to the Category " + d.category + " travelled "
						+ d.totalDistance + "km so far";
			}
		}
		
		return string ;

	}

	public int retrieveCountOfDriver(ArrayList<Driver> al,String name) {

		 Iterator<Driver> itr=al.iterator();
		 
		 int count=0;
		
		 while(itr.hasNext()) {
			 
			 Driver drive=(Driver)itr.next();
			 
			 if(drive.category.equalsIgnoreCase(name)) {
				 
				  count++;
				 
				 System.out.println("Driver id is : " + drive.driverId);
			 }
			 
		 }
			 
		return count;
		 
	}

	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> al) {
		
		ArrayList<Driver> dl=new  ArrayList<Driver>();

		Iterator<Driver> i = al.iterator();

		while (i.hasNext()) {

			Driver d = (Driver) i.next();
			
			if(d.category.equalsIgnoreCase("car")) {

			  dl.add(d);
			
		  }
		
	   }
		
		return dl;
   }

	public String retrieveMaximumDistanceTravelled(ArrayList<Driver> al) {
		
		double maxValue=al.get(0).totalDistance;int j=0;

		for(int i=0;i<al.size();i++) {
				
				if(al.get(i).totalDistance>maxValue) {
					
					maxValue=al.get(i).totalDistance;
					
					 j=i;
				
				}
		}
		   
		System.out.println(maxValue + " travelled distance so far ");
		
		
		return al.get(j).driverName;
		   
	}
}
