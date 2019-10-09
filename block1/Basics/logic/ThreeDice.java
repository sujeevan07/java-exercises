public class ThreeDice {

    public static int getNbrOfCombinations(int sum) {
        if(sum < 3) {
        	return 0;
        }
        
        int count = 0;
    	
        for(int i = 1; i < 7; i++) {
        	for(int j = 1; j < 7; j++) {
        		for(int k = 1; k < 7; k++) {
        			if(i + j + k == sum) {
        				count++;
        			}
        		}
        	}
        }
        return count;
    }
}
