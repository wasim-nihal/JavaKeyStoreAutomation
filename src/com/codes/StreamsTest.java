package com.codes;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays.asList(null,"b1","c1","c2").stream().findAny().ifPresent(s->System.out.println(s));;
		List<String> ls= Arrays.asList("Wasim","a1","","nihal");
		
		List<String> filt= ls.stream().filter(str->!str.isEmpty()).collect(Collectors.toList());
		
		String s2= String.join(" ", ls);
		String merged=ls.stream().filter(s->!s.isEmpty()).collect(Collectors.joining(" "));

		//System.out.println(s2);
	
		//Arrays.asList("Wasim","a1","","nihal",null).stream().filter(s->(s!=null && !s.isEmpty())).forEach(s->System.out.println(s));
	
		List<Integer> i=Stream.iterate(1, c->c+1).filter(c->(c%5==0)).limit(5).collect(Collectors.toList());
		//System.out.println(i);

		// String to Integer Stream
		
		List<String> strLst=Arrays.asList("1","2","3","4");
		List<Integer> intLst= strLst.stream().map(t->Integer.valueOf(t)).collect(Collectors.toList());
		//intLst.stream().map(k->k*k).filter(j->(j!=9)).forEach(System.out::println);
		
		//Date and Time
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate.toString());                //2013-05-15
//		System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
//		System.out.println(localDate.getDayOfMonth());           //15
//		System.out.println(localDate.getDayOfYear());            //135
//		System.out.println(localDate.isLeapYear());              //false
//		System.out.println(localDate.plusDays(12).toString());  
		
		
		//String Tokenizer
		
		StringTokenizer s=new StringTokenizer("Hello World,Hi , how are you",",");
		while(s.hasMoreTokens())
		System.out.println(s.nextToken());
		
		
	
		
	
	}

}
