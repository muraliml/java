package psuDo;

import java.util.Arrays;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String text="We learn java basics as part of java session in java week1";
        int count=0;
        String[] s=text.split(" ");
             for (int i=0;i<=s.length-1;i++)
             {
            	 
                   for (int j=i+1;j<=s.length-1;j++)
                   {
             
            		if(s[i].equals(s[j]))
            		{
            			count=count+1;            			
            			s[i]="";           			
            	    }
            	              		 
                  }
                  
              }
             System.out.print(Arrays.toString(s));   
	}
	 
}


	


