package psuDo;

public class PalindromeS {
	public static void main(String[] args) {
		String p="madfh ";
		String rev= "";
		char[] r=p.toCharArray();
		
		for(int i=r.length-1;i>=0;i--) {
				 rev=rev+r[i];	
	}
		String c = rev.toString();
		 if (p.equals (c)) {
			System.out.println("it is a palindrome");
			}
		 else  {
				System.out.println("it is not a palindrome"); 
	            }
		System.out.println("the original string is "+p);
		System.out.println("after reversing the string "+rev);
}}
