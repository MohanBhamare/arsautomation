package com.learnbybyte.lab.ch4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "Mohan";
		String string2 = "mohan";
		String string3 = "Mohan";
		String lastname = "Bhamare";

		System.out.println("StringTest|main|");
		System.out.println("StringTest|main|string1| " + string1);
		System.out.println("StringTest|main|string2| " + string2);
		System.out.println("StringTest|main|string2| " + string3);

		System.out.println("StringTest|main|string1 Compare to string2| " + string1.equals(string2));
		System.out.println(
				"StringTest|main|string1 Compare to string2|Ignore case| " + string1.compareToIgnoreCase(string2));
		System.out.println("StringTest|main|string1 Compare to string2|NO Ignore case| " + string1.compareTo(string2));
		System.out.println("StringTest|main|string1 Compare to string2|Length of lastname| " + lastname.length());

		System.out.println("");

		char letter1 = 'A';
		char letter2 = 'A';
		System.out.println("StringTest|main|letter1| " + letter1);
		System.out.println("StringTest|main|letter2| " + letter2);

		// System.out.println("StringTest|main|string1| "+letter1 == letter2);

	}

}
