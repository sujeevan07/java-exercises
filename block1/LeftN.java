public class LeftN {
    public static String leftN(String str, int n) {
    	return str = str.length() > n ? str.substring(n) + str.substring(0, n) : str;
    }
}
