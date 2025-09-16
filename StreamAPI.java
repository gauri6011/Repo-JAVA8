package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String []args) {
		
		System.out.println(" ---------------------------------- Map() -----------------------------------------------");
		//example to use the map()
		List <Integer> list=Arrays.asList(1,5,2,4,9,8);
		list.stream().map((n)->n*10).forEach((x)-> System.out.println(x));
		
		
		
		System.out.println(" ---------------------------------- Filter() -----------------------------------------------");
	
		//Even Numbers
		List <Integer> list2=Arrays.asList(1,5,2,4,9,8);
		list2.stream().filter((n)->n%2==0).forEach((x)-> System.out.println(x));
		
		
		
		System.out.println(" ---------------------------------- distinct() -----------------------------------------------");
		
		//Remove Duplicates
		List <Integer> list3=Arrays.asList(1,5,2,4,9,8,7,9,2,4,4);
		list3.stream().distinct().forEach((x)-> System.out.println(x));
		
		
		
        System.out.println(" ---------------------------------- sorted() -----------------------------------------------");
		
		//Sorted by asc
		List <Integer> list4=Arrays.asList(1,5,2,4,9,8,7,9,2,4,4);
		list4.stream().sorted().forEach((x)-> System.out.println(x));
		
		
		//Sorted by desc
		List <Integer> list5=Arrays.asList(1,5,2,4,9,8,7,9,2,4,4);
		list5.stream().sorted((x,y)->y-x).forEach((x)-> System.out.println(x));
		
		
		
		System.out.println(" ---------------------------------- max() -----------------------------------------------");
			
		//find big num
		List <Integer> list6=Arrays.asList(1,5,2,4,9,8,7 );
		int big=list6.stream().max((x,y)->(x-y)).get();
		System.out.println(big);
		
		
		
		System.out.println(" ---------------------------------- min() -----------------------------------------------");
		
		//find small num
		List <Integer> list7=Arrays.asList(1,5,2,4,9,8,7 );
		int small=list7.stream().min((x,y)->(x-y)).get();
		System.out.println(small);
		
		
		System.out.println(" ---------------------------------- Collect() -----------------------------------------------");
		//example to collect element
		List <Integer> list8=Arrays.asList(1,5,2,4,9,8);
		List <Integer> l =list8.stream().filter((n)-> n%2== 0).collect(Collectors.toList());
		System.out.println(l);
		
		
				
	}

}
