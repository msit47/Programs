package Pack1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6,"Six");
		map.put(7,"Seven");
		map.put(8,"Eight");
		map.put(9,"Nine");
		//get(key) returns the value of associated with it in the Hashmap
		String text=map.get(8);
		System.out.println(text);
		//iterating through map and printing the key and value
		//entry set is used to iterate through the map
		for(Map.Entry<Integer,String> en  : map.entrySet())
			
		{
			int key=en.getKey();//getkey()returns the key value
			String value=en.getValue();
			System.out.println("key"+key+":"+"Value"+value);
		}
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			int s=entry.getKey();
		String p=entry.getValue();
		}
		
		//implementing sets
		Set<String> set=new HashSet<String>();
		set.add("swa");
		set.add("swe");
		set.add("thi");
		set.add("tha");
		for(String s:set)
		{
			System.out.println(s);
		}
			
		List<String> list=new ArrayList<String>();
		list.add("cat");
		list.add("rat");
		list.add("mouse");
		list.add("snake");
        Collections.sort(list);
        for(String l:list)

        {
        	System.out.println(l);
        }

        
			
		
		
		
	}

}
