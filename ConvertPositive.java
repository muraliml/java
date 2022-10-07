package week2.day;

public class ConvertPositive {

	public static void main(String[] args) {
		int n=-40;
		int fnum=n;
		if(n<0) {
			System.out.println("given num is negative");
		}

		
		if(n>0) {
			System.out.println("given num is positive");
		}
		n=n*-1;
		System.out.println(fnum+ "is converted into" +n);
	}
	
	

}
