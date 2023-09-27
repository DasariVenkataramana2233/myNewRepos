package autowiring;

public class CompanyName {
	
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public CompanyName(String Name) {
		System.out.println("parameterized Constructor");
		this.Name = Name;
	}
	
	public CompanyName() {
		
		System.out.println("Non parameterized Constructor");
	}
	
	
	

}
