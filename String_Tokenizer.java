package AAAA_PRACTISE;
import java.util.*;

public class String_tokens {
    public static void main(String[] args)
    {
    	String s="veluru karthik reddy 777 csit 2ndyear Btech";
    	String token=" ";
    	StringTokenizer st=new StringTokenizer(s,token,true);
    	System.out.println(st.countTokens());
    	while(st.hasMoreTokens())
    	{
    		 System.out.println(st.nextToken());
    	}
    }
}
/*-------------string Tokenizer functions
     
   ---st.countTokens()
 -----st.hasMoreTokens()
------st.nextToken()
-------------------------------------*/
