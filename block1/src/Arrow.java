public class Arrow {

    public static String arrow(int length, boolean doubleEnded, boolean doubleLine) {
    	String arrow = "";
    	
    	if(length == 0) {
    		return "";
    	}
    	else if(length > 0) {
        	for(int i = 0; i < length; i++) {
        		if(doubleLine == true) {
        			arrow = arrow + "=";
        		}
        		else {
        			arrow = arrow + "-";
        		}
        	}
        	
        	if(doubleEnded == true) {
        		arrow = arrow + ">>";
        	}
        	else {
        		arrow = arrow + ">";
        	}
        }
        else {
        	if(doubleEnded == true) {
        		arrow = arrow + "<<";
        	}
        	else {
        		arrow = arrow + "<";
        	}
        	
        	for(int i = 0; i < Math.abs(length); i++) {
        		if(doubleLine == true) {
        			arrow = arrow + "=";
        		}
        		else {
        			arrow = arrow + "-";
        		}
        	}
        }
    	
    	
        return arrow;
    }
    
    
    
}
