package Java_Pac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Hash_Map_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		hmap.put(1,1);
		hmap.put(2,2);
		hmap.put(3,1);
		hmap.put(4,2);
		hmap.put(5,2);
		hmap.put(6,3);
		HashSet hs= new HashSet();
		for(Entry<Integer, Integer> e : hmap.entrySet()) {
	        int key = e.getKey();
	        int value = e.getValue();
	        System.out.println("Key"+key+":"+"TestVal"+value);
	        hs.add(value);
	    }
		System.out.println("After removing the duplicate values :"+hs);
		
	}

}


/*Output :
	Key1:TestVal1
	Key2:TestVal2
	Key3:TestVal1
	Key4:TestVal2
	Key5:TestVal2
	Key6:TestVal3
	After removing the duplicate values :[1, 2, 3]
*/
	
