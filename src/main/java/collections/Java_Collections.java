package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java_Collections {

	public static void main(String[] args) {
		//col_list();
		//col_set();
		//col_HashTable();
		col_Map();
			}

	public static void col_list() {

		// List is a collection of elements or Records
		// Allow duplicates and null as well

		List<String> students = new ArrayList<String>();

		students.add("BYMAT");
		students.add("Deepika");
		students.add("Akshay");
		students.add("Sunil");
		students.add("Pramod");
		students.add("Shweta");
		students.add("Sunil");
		students.add("BYMAT");
		students.add(null);
		students.add(null);

		System.out.println(students);
		System.out.println("###########################");
		for (String list1 : students) {
			System.out.println(list1);
		}
		System.out.println("###########################");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

	public static void col_set() {

		// Set is a collection of unique Records
		// Don't allow duplicates // Over writing
		// Allows null record

		Set<String> students = new HashSet<String>();
				
		students.add("BYMAT");
		students.add("Deepika");
		students.add("Akshay");
		students.add("Sunil");
		students.add("Pramod");
		students.add("Shweta");
		students.add(null);
		
		students.add("Sunil"); 
		students.add("BYMAT");
		students.add(null);

		System.out.println(students);
		
		System.out.println("###########################");
		for (String list1 : students) {
			System.out.println(list1);
		}
		System.out.println("###########################");
		
		Iterator<String> itr = students.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
	public static void col_HashTable() {// Selenium WD
		
		// Collection of Key and Value pairs records
		// HT will not allow to add null value or record
		// Allow duplicates but it will over write the records in run time
		// HT won't allow null key and value record // Null pointer exp
		
		// HT is collection of unique records
		
		Hashtable<String, String> ht_std = new Hashtable<>();	
		
		ht_std.put("Name", "Deepika");
		ht_std.put("Mobile", "98763231231");
		ht_std.put("City", "Mumbai");
		ht_std.put("State", "Maharashtra");
		
		ht_std.put("City", "Mumbai");
		ht_std.put("State", "Punjab");
		
	//	ht_std.put(null, "Gujrat");
		
		System.out.println(ht_std);
		
		System.out.println(ht_std.get("State"));
		System.out.println(ht_std.get("Mobile"));
		System.out.println(ht_std.get("Name"));
	}
	
	public static void col_Map() { // Cucumber-BDD
		
		// Collection of Key and Value pairs records
		// Allow duplicates but it will over write the records in run time
		// Map allows null key and value record 
		
		Map<String, String> map_std = new HashMap<>();	
		
		map_std.put("Name", "Deepika");
		map_std.put("Mobile", "98763231231");
		map_std.put("City", "Mumbai");
		map_std.put("State", "Maharashtra");
		
		map_std.put("City", "Mumbai");
		map_std.put("State", "Punjab");
		
		map_std.put(null, "Gujrat");
		map_std.put("Pin_Code", null);
		
		System.out.println(map_std);
		
		System.out.println(map_std.get("State"));
		System.out.println(map_std.get("Mobile"));
		System.out.println(map_std.get("Name"));
	}
	
	
}
