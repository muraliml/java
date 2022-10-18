package psuDo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	  {
		String t1="stops";
		String t2="potss";
		int l1=t1.length();
		int l2=t2.length();
		boolean r=l1==(l2);
		char[] a=t1.toCharArray();
		char[] a1=t2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(a1);
		System.out.println("The given strings having same length==>"+r);				
		String u=Arrays.toString(a);
		String v=Arrays.toString(a1);			
		boolean re=(u.contains(v));			
		System.out.println("The given strings having same value==>"+re);
	  }}
