package ObjectInjection;

public class Student {

	private int id;
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void displayInfo() {
		
		System.out.println(this.id);
		
		mathCheat.mathCheat();
	}
	
	
}
