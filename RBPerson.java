import java.awt.Color;

//RBPerson To use for RBTree
public class RBPerson {
	public String name;
	public int licenseNumber;
	RBPerson left, right, parent;
	public Color color;
	
	//Constructor initializes everything
	public RBPerson(String name, int licenseNumber) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		left = right = parent = null;
		//this.color = Color.RED;
		
	}
	
	//return licenseNumber
	public int getLicenseNumber() {
		return this.licenseNumber;
	}
	

	
}
