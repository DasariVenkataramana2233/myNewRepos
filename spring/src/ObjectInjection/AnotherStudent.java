package ObjectInjection;

public class AnotherStudent {
	
	private MathCheat cheat;
	
	public void setCheat(MathCheat cheat) {
		
		this.cheat = cheat;
	}

	
	public void cheat() {
		
		cheat.mathCheat();
	}



	
}
