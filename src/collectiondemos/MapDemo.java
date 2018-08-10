package collectiondemos;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String,Double> tm = new TreeMap<String,Double>();
		tm.put("John Doe", new Double(1420.14));
		tm.put("Rishabh", new Double(110.96));
		tm.put("Rishi", new Double(350.94));
		tm.put("Sakshi", new Double(987420.54));
		tm.put("Yash", new Double(15478.23));
		
		Set/*<Entry<String, Double>>*/ set = tm.entrySet/*<Entry<String, Double>>*/(); //We are doing this conversion to set so that we can use the iterator.
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			
			Map.Entry me = (Map.Entry)i.next(); //Since there are two values, 
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		
		double balance = ((Double)tm.get("John Doe")).doubleValue();
	}

}
