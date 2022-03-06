package fab_28_methods;

import java.util.Scanner;

public class fab28_multplication_of_int_float_long_using_method {
	
	 public static int multiplyint(int a,int b)
	 {
	     int productInt = a * b;
	     return productInt;
	  }
	  public static float multiplyfloat(float a,float b)
	  {
	       float productFloat = a * b;
	       return productFloat;
	      
	  }
	  public static long multiplylong(long a, long b) 
	  {
	      long productLing = a * b;
	      return productLing;
	  }
	  public static void main(String[] args)
	  {
		  int resultInt = multiplyint(10,20);
		  System.out.println ("product of int values is::"+resultInt);
	    
		  float resultFloat = multiplyfloat(2.5f,3.5f);
		  System.out.println("product of float values is::"+resultFloat);
	    
		  long resultLong = multiplylong(135242L,587464L);
		  System.out.println("product of long values is::"+resultLong);
	  }

}
