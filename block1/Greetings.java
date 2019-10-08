import java.util.Scanner;

public class Greetings {
	
	public static String getGreeting(String city) {
		switch(city.toLowerCase()) {
		case "berlin": return "Guten Tag!";
		case "bern": return "Guten Tag!";
		case "london": return "Hello!";
		case "boston": return "Hello!";
		case "paris": return "Bonjour!";
		case "milano": return "Ciao!";
		case "madrid": return "Hola!";
		default: return "City not found!";
		}
	}
	
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter a city: ");
	  String city = scanner.nextLine();
	  System.out.println(getGreeting(city));
	  scanner.close();
  }
}

