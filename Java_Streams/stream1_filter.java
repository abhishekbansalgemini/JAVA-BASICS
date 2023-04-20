package Streams_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream1_filter {
 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		arrayList.add(5);
//		arrayList.add(10);
//		arrayList.add(15);
//		arrayList.add(20);
//		arrayList.add(25);
//		arrayList.add(30);
		
		//Want to do above thing directly-->
		
		List<Integer> arrayList = Arrays.asList(5, 10, 15, 20, 25, 30);
		
		// want to filter only even numbers from this list
		
		// Lets create an empty collection
		
		List<Integer> evenIntegers = new ArrayList<>();
		
		
		
		 // without using streams
		
//		for(int i : arrayList) {
//			if(i%2 == 0) evenIntegers.add(i);
//		}
		
		
		// Using Streams
		
//	    arrayList.stream(); //collection is added to stream
		
//		arrayList.stream().filter(n -> n%2==0); // it filters the even number
		
//		arrayList.stream().filter(n -> n%2==0).collect(Collectors.toList()); // collecting that filtered data
		
		//Here we see, filtering takes place by writing only one statement.
		
		evenIntegers = arrayList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenIntegers);
		
		
		// to print data-->
		
//		arrayList.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));

		//Another way
		
		arrayList.stream().filter(n -> n%2 == 0).forEach(System.out::println);

		
		
		
	}

}
