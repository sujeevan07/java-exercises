public class Fridge {
	
	private int numberOfDrinks = 0;
	private double litersOfMilk = 0;
	
	public Fridge(int numberOfDrinks, double litersOfMilk) {
		this.numberOfDrinks = numberOfDrinks;
		this.litersOfMilk = litersOfMilk;
	}
	
	public int getNumberOfDrinks() {
		return this.numberOfDrinks;
	}
	
	public double getLitersOfMilk() {
		return this.litersOfMilk;
	}
	
	public String takeADrink() {
		if(this.numberOfDrinks > 0) {
			this.numberOfDrinks--;
			return "Here is your drink.";
		}
		else {
			return "Not enough drinks!";
		}
	}
	
	public String takeMilk(double litersOfMilk) {
		if(this.litersOfMilk >= litersOfMilk) {
			this.litersOfMilk -= litersOfMilk;
			return "Here is your milk.";
		}
		else {
			return "Not enough milk!";
		}
	}
	
	public void fillDrinks(int number) {
		this.numberOfDrinks += number;
	}
	
	public void fillMilk(double litersOfMilk) {
		this.litersOfMilk += litersOfMilk;
	}
	
}