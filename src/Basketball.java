
public class Basketball extends Player{
	private double avrPTS;
	private int rebounds;
	private int steals;

	public Basketball (String name, int age){
		super(name, age);
		avrPTS=0;
		rebounds=0;
		steals=0;
	}
	public String toString() {
		return  super.toString() + avrPTS + rebounds + steals ;    
	}
}
