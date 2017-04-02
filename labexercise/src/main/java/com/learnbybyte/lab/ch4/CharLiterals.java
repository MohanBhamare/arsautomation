package com.learnbybyte.lab.ch4;

public class CharLiterals {
	
	public static void main(String[] args) {
		
		char letter1 = 'A';
		System.out.println("CharLiterals|main|");
		System.out.println("CharLiterals|main|d| "+ letter1);
		
		char letter2 = 'A';
		boolean res = letter1 == letter2;
		
		System.out.println("CharLiterals|main|Is  Letter1 =  Letter2?| " +  letter1+  letter2);
		System.out.println("CharLiterals|main|Is  Letter1 == Letter2?| " +  res );		
		char pound = '\u20AC';
		System.out.println("CharLiterals|main|");
		System.out.println("CharLiterals|main|om| "+pound);
		
		
		char qsn = '\u7471';
		System.out.println("CharLiterals|main|");
		System.out.println("CharLiterals|main|om| "+qsn);
		
		char zebra = 'z';
		System.out.println("CharLiterals|main|");
		System.out.println("CharLiterals|main|om| "+zebra);
		
		
	}

}