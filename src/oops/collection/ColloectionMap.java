package oops.collection;

import java.util.HashMap;

public class ColloectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< String, String> map=new HashMap<String, String>();
		map.put("1", "ankit");
		map.put("2", "yadav");
		System.out.println(map);
		map.put("1", "pankaj");
		System.out.println(map);

	}

}
