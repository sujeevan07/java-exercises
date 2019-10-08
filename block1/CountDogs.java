public class CountDogs {

    public static int countDogs(String input) {
    	int counter = 0;
    	
    	if(input.contains("d") && input.contains("g")) {
    		String[] strArray = input.split("");
    		
    		if(strArray.length > 2) {
        		for(int i = 0; i < strArray.length; i++) {
            		if(strArray[i].equals("d") && i < strArray.length - 2) {
            			if(strArray[i + 1].equals("a") || strArray[i + 1].equals("e") || strArray[i + 1].equals("i") || strArray[i + 1].equals("o") || strArray[i + 1].equals("u") && i < strArray.length - 1) {
            				if(strArray[i + 2].equals("g")) {
            					counter++;
            				}
            			}
            		}
            	}
        	}
    	}
        return counter;
    }

}
