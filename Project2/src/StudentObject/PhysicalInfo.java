package StudentObject;

public class PhysicalInfo {

	int height;
	int weight;
	String skin_type;
	
	
	public PhysicalInfo(int height, int weight, String skin_type) {
		this.height = height;
		this.weight = weight;
		this.skin_type = skin_type;
		
	}
	
	public void display() {
		System.out.println("The height(in inch) is: "+height);
		System.out.println("The weight(in kg) is: "+weight);
		System.out.println("The skin type is: "+skin_type);
	}
}
