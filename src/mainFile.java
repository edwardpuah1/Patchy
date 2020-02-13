import java.util.ArrayList;

public class mainFile {

	public static void main(String[] args){

		ArrayList<columnVarStore> strArrayList = new ArrayList<columnVarStore>();
		String varStrStore;
		
		strArrayList.add(new columnVarStore("Hello", "My", "House"));
		strArrayList.add(new columnVarStore("This", "On", "Fire"));
		
		/*
		 * Printing out all contents of ArrayLists
		 * For Testing
		 */
		for(int i = 0; i < strArrayList.size(); i++) {
			
			System.out.println(strArrayList.get(i).toString());
			
		}
		
		
		
	}

}
