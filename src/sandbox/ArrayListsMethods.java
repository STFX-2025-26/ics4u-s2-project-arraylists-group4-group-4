package sandbox;
import java.util.ArrayList;	

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
	
	
	
}
