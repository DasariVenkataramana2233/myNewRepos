package autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Company cName;
	
	 public Employee() {
		 
		 System.out.println("no argument constructor");
	 }
	
	 
	  public Employee(Company cName) { super(); this.cName = cName;System.out.println("argument construtor"); }
	 

	
	public void setcName(Company cName) {
		this.cName = cName;
	}
	
	public void Display() {
		
		if(cName!=null) {
			
			System.out.println("this is Employee class ");
			
			cName.name();
			
		}
		
		else {
			
			System.out.println("You are not an employee");
		}

	}
}
