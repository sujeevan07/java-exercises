import java.util.Arrays;

public class LoneSum {

    public static int loneSum(int[] values) {
    	int sum = 0;
    	
    	if(values.length < 1) {
    		return sum;
    	}
    	else if(values.length == 1) {
    		return values[0];
    	}
    	
    	Arrays.sort(values);
    	
    	for(int i = 0; i < values.length; i++) {
    		if(i == 0) {
    			if(values[i] != values[i + 1]) {
    				sum = sum + values[i];
    			}
    		}
    		else if(i == (values.length - 1)) {
    			if(values[i] != values[i - 1]) {
    				sum = sum + values[i];
    			}
    		}
    		else {
    			if(values[i] != values[i + 1] && values[i] != values[i - 1]) {
    				sum = sum + values[i];
    			}
    		}
    	}
    	return sum;
    }

}
