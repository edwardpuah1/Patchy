import java.util.ArrayList;

public class mainFile {

	public static void main(String[] args){

		ArrayList<ArrayList<String>> strArrayList = new ArrayList<ArrayList<String>>();
		ArrayList<String> strStoreList = new ArrayList<String>();
		
		strStoreList.add("Hi");
		strStoreList.add("My");
		strArrayList.add(strStoreList);
		
		//System.out.println(strArrayList.get(0).get(1));
		
		
	}

}
