package week2.day;

public class PrimeF {

	public static void main(String[] args) {
	
		for (int n=0;n<=50;n++) {
			if(n==0 || n==1) {
				System.out.println(n +"--is not prime");
			}
			
			else if(n==2 || n==3) {
				System.out.println(n+"--is a prime");
			}
			
		    else if (n%2==0 || n%3==0) {
			System.out.println(n+"--is not prime");
			}
			
		    else {
				System.out.println(n+"--is a prime");
			}
		}

	}

}
