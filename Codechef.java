/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Entered");
        Scanner in = new Scanner(System.in);
    	int number_of_testcases = in.nextInt();
    	while(number_of_testcases>0)
    	{
            System.out.println("Entered while");
    	    long ts = in.nextLong();
    	    if(ts%2!=0)
    	    {
    	        System.out.println((ts-1)/2);
    	    }
    	    else
    	    {
    	        long js_wins = 0;
    	        long pro_ts = ts;
    	        int count = 0;
    	        while(pro_ts%2==0)
    	        {
    	            count++;
                    pro_ts = pro_ts/2;
    	        }
    	        for(long i = 2 ; i < ts ; i+=2)
    	        {
    	           // int temp1 = i;
    	           // int temp2 = ts;
    	           int c = 0;
    	           System.out.println("Js "+i+"ts "+ts);
    	            long pro_js = i;
    	           // long pro_ts = ts;
    	           
    	            while(pro_js%2==0 && c<count+2)
    	            {
    	                c++;
                        pro_js = pro_js/2;
    	            }
    	            if(c>count)
    	            {
    	                js_wins++;
    	            }
    	           // if(pro_ts%2!=0 && pro_js%2==0)
    	           // {
    	           //     System.out.println("pro_js "+pro_js+"pro_ts "+pro_ts);
    	           //     js_wins++;
    	           // }
    	        }
    	       // System.out.println(js_wins);
    	    }
    	    number_of_testcases--;
    	}
	}
}
