package AAAA_PRACTISE;
import java.util.*;
import java.util.Collections;
import java.lang.Math;

class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList();
		ar.add(4);
		ar.add(5);
		ar.add(5);
		ar.add(7);
		ar.add(5);
		ar.add(5);
		ar.add(4);
		ar.add(6);
		ar.remove("7");
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println(" "+ar.indexOf(5));
		if(ar.contains(7))
			System.out.println("index ids:"+ar.indexOf((7)));
		Set<Integer>s=new HashSet(ar);
		
		for(int i:s)       //------>using for each method for collections
			System.out.println(i);
		ar.forEach(( i)->System.out.print(" "+i));

	}

}
