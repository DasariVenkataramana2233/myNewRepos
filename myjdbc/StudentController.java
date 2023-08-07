package myjdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentController {

	public static void main(String[] args) throws SQLException {

		StudentDao dao = new StudentDao();

		StudentDto dto = new StudentDto();

		StudentCal cal = new StudentCal();

		Scanner scan = new Scanner(System.in);

		/*
		 * dto.setName("ramana"); dto.setTel(76); dto.setHin(67); dto.setEng(78);
		 * dto.setMath(87); dto.setSci(96); dto.setSoc(57);
		 */

//		cal.insertRecord(dto);//to update total column just call service method automatically updates everything

		// dao.insertRecord(dto);

		// while updating..................

		/*
		 * dto.setName("vinodA");
		 * 
		 * dao.updateDetails(dto,3);
		 */

		// while getting element by id

		/*
		 * dto.setId(1);
		 * 
		 * dao.getElementById(dto);
		 * 
		 * dao.getElementById(2);
		 */

		// while deleting element by id

		/*
		 * dto.setId(5);
		 * 
		 * dao.deleteElementById(dto);
		 */

		// Getting all elements at a time

		/* dao.getAllElements(); */

// deleting all the elements

//		  dao.deleteAllElements();
		
		System.out.println("Choose from below Options to work with");
		
		System.out.println("1.insert\n2.update\n3.getAllElements\n4.getElementById\n5.deleteElements\n6.deleteElementByID");

		int choice = scan.nextInt();

		switch (choice) {
		
			case 1 :{
				
					System.out.println("Inside insertRecord() method");
				
				  dto.setName("Prasad"); dto.setTel(60); dto.setHin(50); dto.setEng(55);
				  dto.setMath(45); dto.setSci(55); dto.setSoc(66);
				 
				        cal.insertRecord(dto);
				  
			       break;    
		      }
			case 2:{
				
				System.out.println("inside updateDetails() method ");
				
				System.out.println("Enter the name to set correctly");
				
				 String d=scan.next();
					
					dto.setName(d);
					
				 System.out.println("Enter Id to recorrect name");
				 
				         int m=scan.nextInt();
				
				       dao.updateDetails(dto,m);
				
				break;
			}
			case 3:{
				
				System.out.println("inside getAllElements() method");
				
				dao.getAllElements();
				
				break;
			}
			
			case 4:{
				
				
				System.out.println("inside getElementById() method");
				
				System.out.println("Enter correct Id to retreive");
				
				int n=scan.nextInt();
				
				dao.getElementById(n);
				
				break;
			}
			case 5:{
				
				System.out.println("inside deleteAllElements() method ");
				
				dao.deleteAllElements();
				
				break;
				
			}
				
			case 6:{
				
				System.out.println("Inside deleteElementById() method");
				
                System.out.println("Enter correct Id to delete");
				
				int n=scan.nextInt();
				
				dto.setId(n);
				
				dao.deleteElementById(dto);
				
				break;
			}
			
			default:{
				
				System.out.println("You have selected the wrong options..please choose correct");
				
				break;
			}

		}

	}

}
