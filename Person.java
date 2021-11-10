//Class Person for implementing BST
public class Person {
	public String name;
	public int licenseNumber;
	Person left, right, parent;
	
	//constructs a new person
	public Person(String name, int licenseNumber) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		left = right = parent = null;
	}
	
	//returns the licenseNumber
	public int getLicenseNumber() {
		return this.licenseNumber;
	}
}
