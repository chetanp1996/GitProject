package map;
import java .util.Map;
import java .util.HashMap;
public class Practice {

	public static void main(String[] args) {
	Map m1 = new HashMap();
	m1.put("key1", 123);
	m1.put("key2", "number");
	m1.put(null, "value");
    System.out.println("map elements are : " +m1);
    System.out.println("the size of map elements are : " +m1.size());
    System.out.println("get the key value : " +m1.get("key3"));
    System.out.println(" set te value of : " +m1.keySet());
    System.out.println(" the value of map " +m1.values());

	
	System.out.println("************************");
	
	Map m2 = new HashMap();
	m2.put("a1", 123);
	m2.put("a2", 456);
	m2.put("a3", 789);
	System.out.println("map elements are : " +m2);
	System.out.println("the size of elements are : " +m2.size());
	
	m1.putAll(m2);
	System.out.println("map elements are : " +m2);
    System.out.println("map size is : " +m2.size());
	}
}
