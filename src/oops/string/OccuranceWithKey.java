package oops.string;

import java.util.ArrayList;
import java.util.*;

public class OccuranceWithKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val="mynameisankit";
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<val.length();i++) {
			al.add(val.charAt(i));
		}
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<val.length();i++) {
			
			hm.putIfAbsent(al.get(i),Collections.frequency(al,al.get(i)));
		}
		
		for(Map.Entry<Character,Integer> e:hm.entrySet()){
		System.out.println("Character is:"+e.getKey()+" Occurences:"+e.getValue());
		}

	}

}
