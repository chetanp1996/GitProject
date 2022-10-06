package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Practice3 {
	
 public static void main(String[] args) {
List cs = new ArrayList();
cs.add("mango");
cs.add(1234);
cs.add(null);
cs.add('c');
cs.add("banana");
cs.add(true);
//cs.add(6, "chetan");
cs.add(new ArrayList());

System.out.println("***********************");
System.out.println("size of array : " +cs.size());
System.out.println("print the array : " +cs);

for(int i = 0; i<cs.size(); i++) {
	System.out.println("the array list : " +cs.get(i));
}
System.out.println("****************************");
for (Object chetan : cs) {
	System.out.println(cs);
}
cs.set(2, "chetan");
System.out.println(cs.get(4));
System.out.println("size of list : " +cs.size());
System.out.println("index wise list " +cs);

//Collections.sort(cs);
//System.out.println("size of array : " +cs.size());
//System.out.println(" After sorting :" +cs);

System.out.println("***************************");
cs.forEach(c -> {
	System.out.println(c);
});

System.out.println("*********Iterator**********");
Iterator cp = cs.iterator();

while(cp.hasNext()) {
	System.out.println(cp.next());
}

System.out.println(cp.hasNext());

System.out.println("-------------------------");
while(cp.hasNext()) {
	System.out.println(cp.next());
}
System.out.println("============================");
Iterator csp = cs.iterator();

while(csp.hasNext()) {
	System.out.println(csp.next());
}


 }
}
