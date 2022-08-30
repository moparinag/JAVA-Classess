package MapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashmap1 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put(100, 67544);
		map.put(1, "Mona");
		map.put(3, 78);
		map.put(6, "Mona");
		map.put(12, "Mummy");
		map.put(77, "Daddy");
		map.put(8, 68.09);
		map.put(2, 7654);
		map.put(10, "Kalyan");
		map.put(null, 754534);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		Set entry = map.entrySet();
		Iterator itr = entry.iterator();
		System.out.println(".....Iterator Non Generic Type.....");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(".....Iterator using Generic Type.....");
		Set<Map.Entry<Integer, Object>> entry1 = map.entrySet();
		Iterator<Entry<Integer, Object>> itr1 = entry1.iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, Object> mvalue=(Entry<Integer, Object>) itr1.next();
			System.out.println(mvalue.getKey()+"--"+mvalue.getValue());
		}
		

	}

}
