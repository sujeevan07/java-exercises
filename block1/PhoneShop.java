public class PhoneShop {
	private String owner = "";
	private int phoneStock = 0;
	private int phonecaseStock = 0;
	
	public PhoneShop(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public int getPhoneStock() {
		return this.phoneStock;
	}
	
	public int getPhonecaseStock() {
		return this.phonecaseStock;
	}
	
	public void fillStockCases(int number) {
		this.phonecaseStock += number;
	}
	
	public void fillStockPhones(int number) {
		this.phoneStock += number;
	}
	
	public String phoneSold() {
		if(this.phoneStock > 0) {
			this.phoneStock--;
			return "OK";
		}
		else {
			return "NOK";
		}
	}
	
	public String caseSold() {
		if(this.phonecaseStock > 0) {
			this.phonecaseStock--;
			return "OK";
		}
		else {
			return "NOK";
		}
	}
}