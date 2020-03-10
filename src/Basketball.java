
public class Basketball extends Player{
	private double avrPTS;
	private int rebounds;
	private int steals;

	public Basketball (String name, int age, double avrPTS, int rebounds, int steals){
		super(name, age);
		this.avrPTS=avrPTS;
		this.rebounds=rebounds;
		this.steals=steals;
	}

}
