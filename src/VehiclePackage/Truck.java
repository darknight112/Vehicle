package VehiclePackage;

public class Truck extends Vehicle {
	private int numberOfAxles;
	private int capacityInTons;
	
	public void load(int weight) {
		if(weight<capacityInTons) {
			System.out.println("Loaded "+ weight +" tons");
		}
		else {
			System.out.println("Over weight");
		}
	}
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	public int getCapacityInTons() {
		return capacityInTons;
	}
	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}
	
}
