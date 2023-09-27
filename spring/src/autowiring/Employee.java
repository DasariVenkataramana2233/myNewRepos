package autowiring;

public class Employee {

	private int empId;
	private String eName;
	private double sal;
	private CompanyName companyName;
	
	

	public Employee(int empId, String eName, double sal, CompanyName companyName) {
		System.out.println("parameterized constructor");
		this.empId = empId;
		this.eName = eName;
		this.sal = sal;
		this.companyName = companyName;
	}

	public Employee() {
		
		System.out.println("Non parameterized Constructor");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("Setter1 EMpId");
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		System.out.println("Setter2 Ename");
		this.eName = eName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		System.out.println("Setter3 Sal");
		this.sal = sal;
	}

	public CompanyName getCompanyName() {
		return companyName;
	}

	public void setCompanyName(CompanyName companyName) {
		this.companyName = companyName;
	}

	public void infoDisplay() {
		
		System.out.println(this.empId);
		System.out.println(this.eName);
		System.out.println(this.sal);
		System.out.println(companyName.getName());
	}
	
	
	
	
}
