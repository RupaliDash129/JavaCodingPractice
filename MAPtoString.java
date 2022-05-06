package interviewQuestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class MAPtoString {
	public static void main(String[] args) {

	    Map<Integer, String> map = new HashMap<Integer, String>();
	    map.put(100, "1");
	    map.put(101, "2");
	    map.put(102, "2");
	    map.put(103, "3");
	    map.put(104, "3");
//	   nnnnn                              
	    System.out.println(map);
	    Set<String> set = new HashSet<String>();
	    map = map.entrySet()
	        .stream()
	        .filter(entry -> set.add(entry.getValue()))
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	    System.out.println(map);
	}

}
