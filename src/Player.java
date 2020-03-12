
public class Player {
	private String name;
	private int age;

	public Player (String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return  name + age;    
	}
	
	public boolean  equals(Object o ) {
		Point other= (Point) o;
		return x == other.x && y== other.y;
	}
}
