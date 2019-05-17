
public class House implements Place{
	
	private String address;
	
	public House(String address) {
		this.address = address;
	}
	
	public boolean canDeliver() {
		return true;
	}
	
	public String toString() {
		return address;
	}
}
