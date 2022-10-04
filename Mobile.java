package week1.day1;

public class Mobile {

	public  void makeCall(String model,float weight) {
		// TODO Auto-generated method stub
         String mobileModel="j6";
         float mobileWeight=300;
         System.out.println("mobile model is:"+mobileModel);
         System.out.println("mobile weight is:"+mobileWeight+"grams");
	}
	public  void sendMsg(boolean Charged,int Cost) {
		// TODO Auto-generated method stub
         boolean FullCharged =true;
         int mobileCost=15000;
         System.out.println("Fully charged:"+FullCharged);
         System.out.println("mobile cost is:"+mobileCost+"Rs");
	}
	public static void main(String[] args) {
		Mobile d =new Mobile();
		d.makeCall("j6",300);
		d.sendMsg(true,15000);
		
		System.out.println("This is my mobile ");
		
	}
	
}
