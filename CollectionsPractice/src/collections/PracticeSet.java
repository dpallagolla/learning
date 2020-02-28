package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeSet {

	public static void main(String args[]) {
					
		//new PracticeSet().hashSet();
		new PracticeSet().linkedHashSet();
	}
	
	public void hashSet() {
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("one");
		hashSet.add("two");
		
		hashSet.forEach(s -> {
			System.out.println(s);
		});
		
	}
	
	public void linkedHashSet() {
		
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("a");
		linkedHashSet.add("a");
		linkedHashSet.add("b");
		
		linkedHashSet.forEach(s->{
			System.out.println(s);
		});
		
	}
	
}
