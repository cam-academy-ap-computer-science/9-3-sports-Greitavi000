
public class Running extends Player {
	private double time;
	private double distansePerMinute;
	private int firstPlase;

	public Running (String name, int age, double time, double distansePerMinute, int firstPlase){
		super(name, age);
		this.time=time;
		this.distansePerMinute=distansePerMinute;
		this.firstPlase=firstPlase;
	}

}
