package examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaTest {

	private static List<String> linkedList = new LinkedList<String>();
	private static List<String> arrList = new ArrayList<String>();
	private static Set<String> hashSet = new HashSet<String>();
	private static Set<String> treeSet = new TreeSet<String>();
	
	public static void main(String[] args) {
		
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		linkedList.add("Fourth");
		
		arrList.add("First");
		arrList.add("Second");
		arrList.add("Third");
		arrList.add("Fourth");
		
		hashSet.add("First");
		hashSet.add("Second");
		hashSet.add("Third");
		hashSet.add("Fourth");
		
		treeSet.add("First");
		treeSet.add("Second");
		treeSet.add("Third");
		treeSet.add("Fourth");
	
		Iterator<String> linkedIterator = linkedList.iterator();
		Iterator<String> arrIterator = arrList.iterator();
		Iterator<String> hashSetIterator = hashSet.iterator();
		Iterator<String> treeSetIterator = treeSet.iterator();
		
		System.out.println("Linked list iterator:");
		while(linkedIterator.hasNext()){
			System.out.println(linkedIterator.next());
		}
		
		System.out.println("\nArray List iterator:");
		while(arrIterator.hasNext()){
			System.out.println(arrIterator.next());
		}
		
		System.out.println("\nHash set iterator:"); // Læg mærke til at HashSet er i en fast usorteret orden.
		while(hashSetIterator.hasNext()){
			System.out.println(hashSetIterator.next());
		}
		
		System.out.println("\nTree set iterator:"); // Læg mærke til at treeset automatisk sorterer.
		while(treeSetIterator.hasNext()){
			System.out.println(treeSetIterator.next());
		}
	}

}
