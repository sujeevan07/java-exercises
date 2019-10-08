

public class MostFrequentDigit {

    public static int getMostFrequentDigit(String digitString) {
        // TODO Implement the method
    	String[] arrNumbers = digitString.split("");
    	int[] results = new int[10];
    	
    	// Initialize results array
    	for(int i = 0; i < results.length; i++) {
    		results[i] = 0;
    	}
    	
    	for(int i = 0; i < arrNumbers.length; i++) {
    		
    		switch(arrNumbers[i]) {	
    			case "0":	results[0]++;
    						break;
    			case "1":	results[1]++;
    						break;
    			case "2":	results[2]++;
							break;
    			case "3":	results[3]++;
							break;
    			case "4":	results[4]++;
							break;
				case "5":	results[5]++;
							break;
				case "6":	results[6]++;
							break;
				case "7":	results[7]++;
							break;
				case "8":	results[8]++;
							break;
				case "9":	results[9]++;
							break;
    		}
    		
    	}
    	
    	int biggestNum = 0;
    	int index = 0;
    	
    	for(int i = 0; i < results.length; i++) {
    		if(results[i] > biggestNum) {
    			biggestNum = results[i];
    			index = i;
    		}
    	}
    	
    	return index;
    }
}
