package Vararg;

public class ConstOverloading {
	int rollNum;
	ConstOverloading()
	   {
	      rollNum =100;
	   }
	ConstOverloading(int rnum)
	   {
		 this();
	      rollNum = rollNum+ rnum;
	      System.out.println(rollNum);
	   }
	 
	  
	   public static void main(String args[])
	   {
		   ConstOverloading obj = new ConstOverloading(12);
	   
	    }
}
