
public class Baseball extends Player{
	private double BA;
	private int HR;
	private int hits;

	public Baseball (String name, int age, double BA, int HR, int hits){
		super(name, age);
		this.BA=BA;
		this.HR=HR;
		this.hits=hits;
	}


}
