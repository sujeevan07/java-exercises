

public class PairwiseSum {

    public static int[] pairwiseSum(int[] values) {
    	
    	if(values.length < 2) {
    		return new int[0];
    	}
    	
    	int[] results = new int[values.length - 1];
    	
        for(int i = 0; i < values.length - 1; i++) {
        	results[i] = values[i] + values[i + 1];
        }
    	
        return results;
    }
}
