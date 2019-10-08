public class SameNumbers {

    public static boolean sameNumbers(int[] values1, int[] values2) {
        int[] smallArr = {};
        int[] bigArr = {};
        
        if(values1.length < values2.length) {
        	bigArr = values2;
        	smallArr = values1;
        }
        else {
        	bigArr = values1;
        	smallArr = values2;
        }
        
        boolean containsNumber = false;
        
        for(int i = 0; i < bigArr.length; i++) {
        	containsNumber = false;
        	for(int j = 0; j < smallArr.length; j++) {
        		if(bigArr[i] == smallArr[j]) {
        			containsNumber = true;
        		}
        	}
        	if(containsNumber == false) {
        		return false;
        	}
        }
    	
        return true;
    }
}
