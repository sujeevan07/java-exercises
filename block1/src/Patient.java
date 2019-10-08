public class Patient {
	private String name = "";
	private Checkup checkup = null;
	
	public Patient(String name) {
		this.name = name;
	}
	
	public void addCheckup(int height, double weight, double temp, boolean vaccs) {
		this.checkup = new Checkup(height, weight, temp, vaccs);
	}
	
	public String toString() {
		return "Name: "
				+ this.name
				+ ",Height: "
				+ this.checkup.getHeight()
				+ ",Weight: "
				+ this.checkup.getWeight()
				+ ",Temperature: "
				+ this.checkup.getTemperature();
	}
}