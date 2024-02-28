
import java.util.*;

public class CountAndPrint {
	
	 private static void countAndPrint(String str) {
		  Map<Character, Integer> charCounts = new HashMap<>();

	       
	        for (char c : str.toCharArray()) {
	           
	            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
	        }

	        
	        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
	            System.out.println("Count of " + entry.getKey() + ": " + entry.getValue());
	        }
	    }
    public static void main(String[] args) {
    	  String inputString = "AAABBBBCCB";
    	  countAndPrint(inputString);

    }
}
