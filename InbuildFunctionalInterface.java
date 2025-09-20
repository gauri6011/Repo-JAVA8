package Java8;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuildFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer>evenOdd=(n)->n%2==0;
		System.out.println(evenOdd.test(8));                              // return true if it is even else false
		
		
		Function <String,String>Upper=(s)->s.toUpperCase();
		System.out.println(Upper.apply("abc"));                          //return all letters in upper case
		
		Consumer<String>Lower=(n)->System.out.println(n.toLowerCase());
		Lower.accept("GAURI");                                           //return all letters in lower case
		
		
		Supplier<Object>date=()->LocalDate.now();
		System.out.println(date.get());                                  // current date
		
	}
}
