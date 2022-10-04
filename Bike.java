package week1.day1;

public class Bike {
	public void applyBreak() {
	     
	    System.out.println("applied break");
	          }
	
	public void soundHorn() {
	     
	    System.out.println("sound horn");
	          }
	 

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 System.out.println("this is my bike");
		 Bike b=new Bike();
	      	  b.applyBreak();
	      	 b.soundHorn();
	      	 
	      	 System.out.println("this is my car");
				Car c=new Car();
				c.applyBreak();
				c.soundHorn();
}
	 }
	 
