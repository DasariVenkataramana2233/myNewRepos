package travelagencyapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) throws DriverException {

		Driver d = new Driver();

		d.setDriverId(1);
		d.setDriverName("puneeth");
		d.setCategory("Car");
		d.setTotalDistance(100.0);

		Driver d1 = new Driver();
		d1.setDriverId(2);
		d1.setDriverName("raj kumar");
		d1.setCategory("Lorry");
		d1.setTotalDistance(200.32);

		Driver d2 = new Driver();
		d2.setDriverId(3);
		d2.setDriverName("kumar");
		d2.setCategory("car");
		d2.setTotalDistance(300.32);

		Travel travel = new Travel();


		ArrayList<Driver> al = new ArrayList<Driver>();
		al.add(d);
		al.add(d1);
		al.add(d2);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your choice");

		System.out.println(
				"1.isCarDriver\n2.retrieveByDriverId\n3.retrieveCountOfDriver\n4.retrieveDriver\n5.retrieveMaximumDistanceTravelled");

		int n = scan.nextInt();

		switch (n) {

		case 1: {

			travel.isCarDriver(d);
			break;
		}
		case 2: {

			System.out.println("pass the id to retrieve by id : ");
			int sc=scan.nextInt();
				
				System.out.println(travel.retrieveByDriverId(al, sc));
			
			break;
		}
		case 3: {

			System.out.println("count of drivers with car : " + travel.retrieveCountOfDriver((al), "car"));
			break;
		}

		case 4: {

			Iterator<Driver> itr = (travel.retrieveDriver(al)).iterator();

			while (itr.hasNext()) {

				Driver dm = itr.next();

				System.out.println(dm.driverId + dm.driverName + dm.category + dm.totalDistance);

			}
			break;

		}

		case 5: {

			System.out.println(travel.retrieveMaximumDistanceTravelled(al));
			break;

		}
		default: {

			System.out.println("OOPS!!!!..You have entered the wrong option .Choose the correct options from 1-5");
			break;
		  }
		}

	}

}
