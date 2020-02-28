package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class PracticeList {
	
	public static void main(String args[]) {
		
		//new PracticeList().arrayList();
		//new PracticeList().linkedList();
		//new PracticeList().vector();
		PracticeList.genericParamAcceptor(11);
		PracticeList.genericParamAcceptor("something");
		
	}
	
	public void practiceStack() {
		
		List<Integer> stacko = new Stack<Integer>();
		
		((Stack<Integer>) stacko).push(1);
		((Stack<Integer>) stacko).pop();
		
		
	}
	
	public void arrayList(int a) {
	
		int[] b= new int[5];
		
		
	}
				
	public void arrayList() {
			
			//List is an interface, so it cannot be instantiated directly
			List<String> stringList = new ArrayList<>();
			
			stringList.add("one");
			stringList.add("two");
			
			Iterator<String> it = stringList.iterator();
			
			stringList.forEach( s -> {
				System.out.println(s);
				//stringList.add("p");
			});
			
			for(int i=0;i<stringList.size();i++) {
				System.out.println(stringList.get(i));
			}
			
			for(String s: stringList) {
				System.out.println(s);
				//stringList.add("p");
			}
			
			while(it.hasNext()) {				
				System.out.println(it.next());	
				//stringList.add("p");
			}
			
		}
		
	public void linkedList() {
		
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("one");
		linkedList.add("two");
		

		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
		
		
		linkedList.forEach(s -> {
			System.out.println(s);
		});
		
		ListIterator<String> it = (ListIterator<String>) linkedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it = linkedList.listIterator(linkedList.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}
	
	public void vector() {
		
		// a vector has .elements function
		Vector<String> vectorString = new Vector<>();
		
		vectorString.add("one");
		vectorString.add("two");
		
		for(int i=0;i<vectorString.size();i++) {
			System.out.println(vectorString.get(i));
		}
		
//		Iterator<String> it =  vectorString.iterator();
//		while(it.hasNext()) {		
//			it.remove();
//			break;			
//		}
											
	}
	
	public static <T> void genericParamAcceptor(T something) {
		
		System.out.println(something);
		
	}

}
