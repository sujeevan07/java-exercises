public class Checkup {
	int height = 0;
	double weight = 0;
	double temp = 0;
	boolean vaccs = false;
	
	public Checkup(int height, double weight, double temperature, boolean vaccsok) {
		this.height = height;
		this.weight = weight;
		this.temp = temperature;
		this.vaccs = vaccsok;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getTemperature() {
		return this.temp;
	}
	
	public boolean getVaccsOk() {
		return this.vaccs;
	}
}
