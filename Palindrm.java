package week2.day;

public class Palindrm {

	public static void main(String[] args) {
	
		int reversed=0,remainder;
		int num=34343;
		int originalnum=num;
		for (int i=5;i>0;i--) {
			remainder=num%10;
			reversed =reversed*10+remainder;
			num/=10;
			
		}
		if(originalnum==reversed) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
	}

}
