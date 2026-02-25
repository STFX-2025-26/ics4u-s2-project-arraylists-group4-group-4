package sandbox;
import java.util.ArrayList;
import java.util.Collections;	

public class ArrayListsMethods {

	/*
	 * DESCRIPTION - List all the names
	 * PARAMETERS - ArrayList<String>
	 * RETURN TYPE - String
	 */
	public static String listMethod(ArrayList<String> x) {
		
		String y = "";
		
		for(int i=0; i<x.size();i++) {
			
			y = y + "\n" + x.get(i);
			
		}
		
		return y;
	}
	
	/*
	 * DESCRIPTION - add names to array
	 * PARAMETERS - ArrayList<String> x, String y
	 * RETURN TYPE - void
	 */
	public static void addMethod (ArrayList<String> x, String y) {
		
		
		
	}
	
	
	/* DESCRIPTION - sorts ArrayList alphabetically; ascending
	 * PARAMETERS - ArrayList<String> a
	 * RETURN TYPE - void
	 */
	public static void sortMethod (ArrayList<String> a) {
		
		Collections.sort(a, String.CASE_INSENSITIVE_ORDER);
		
	}
	
	
}
