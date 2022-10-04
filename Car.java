package week1.day1;

public class Car {
	public void applyBreak() {
	     
	    System.out.println("applied break");
	          }
	
	public void soundHorn() {
	     
	    System.out.println("sound horn");
	          }
	
	 public static void main(String[] args) {
		 System.out.println("this is my car");
			Car c=new Car();
			c.applyBreak();
			c.soundHorn();
}
}