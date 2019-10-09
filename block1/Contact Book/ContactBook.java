public class ContactBook {
	
	private int index = 0;
	private int contactAmount = 0;
	private int capacity = 0;
	private Contact[] contacts = null;
	
	public ContactBook(int capacity) {
		this.capacity = capacity;
		contacts = new Contact[capacity * 10];
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getSize() {
		return this.contactAmount;
	}
	
	public boolean addContact(Contact contact) {
		if(contact == null) {
			return false;
		}
		
		if(this.index >= this.capacity) {
			this.addCapacity();
		}
		
		if(this.findContact(contact.getName()) == null) {
			this.contacts[index] = contact;
			index++;
			contactAmount++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Contact findContact(String name) {
		Contact contact = this.findAndDestroy(name, false);
		if(contact != null) {
			return contact;
		}
		return null;
	}
	
	public boolean removeContact(String name) {
		if(this.findAndDestroy(name, true) != null) {
			this.contactAmount--;
			return true;
		}
		return false;
	}
	
	private Contact findAndDestroy(String name, boolean destroy) {
		for(int i = 0; i < this.contacts.length; i++) {
			if(this.contacts[i] != null && this.contacts[i].getName().equals(name)) {
				if(destroy) {
					Contact contact = this.contacts[i];
					this.contacts[i] = null;
					return contact;
				}
				return this.contacts[i];
			}
		}
		return null;
	}
	
	private void addCapacity() {
		this.capacity++;
	}
	
}