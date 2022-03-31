package AAAA_PRACTISE;
import java.util.*;

public class Collections {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   Map<Integer,Integer> mp=new HashMap<>();
	   int []a=new int[7];
	   System.out.println("enter the no:");
	   for(int i=0;i<7;i++)
		   a[i]=sc.nextInt();
	   for(int i=0;i<7;i++)
	   {  if(!mp.containsKey(a[i]))
		   mp.put(a[i],1);
	      else
		  mp.put(a[i], mp.get(a[i])+1);
	   }
	   for (Map.Entry  e : mp.entrySet())
		  System.out.println(e.getKey() + " "+ e.getValue());
	   mp.forEach((k, v)
	   -> System.out.println(k + " : "+ (v + 10)));
	   
   }
}
