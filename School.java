
public class School implements Place{
	
	private String name;
	
	public School(String name) {
		this.name = name;
	}
	
	public boolean canDeliver() {
		return false;
	}
	
	public String toString() {
		return name;
	}
}
