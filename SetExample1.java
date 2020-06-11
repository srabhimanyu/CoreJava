import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	
public static void main(String args[]) {
	
	Set<Integer> sl=new HashSet<>();	
	int a[]= {1,1,2,2,2,3,3,3,4,5,5,6,6};
	
	for(int i=0;i<a.length;i++) 
		sl.add(a[i]);
	
	System.out.println(sl);
	
	Integer b[]= new Integer[] {1,2,3,4,5,6,7,8,9,10};
	
	sl.addAll(Arrays.asList(b));
	
	
	System.out.println(sl);
	
	sl.removeAll(Arrays.asList(b));
	
	System.out.println(sl);
	
}
	
	
	
}
