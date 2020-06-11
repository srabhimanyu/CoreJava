import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public void getData(List<? super Integer> list) {
		list.add(32);
		System.out.println(list);
		
		
	}
	
	public static void main(String args[]) {
		
	//	ArrayList<Number> al=new ArrayList<>();
		//al.add(21.8);
	//	al.add(32);
//		al.add(32.65F);
	//	Main1 m=new Main1();
		// m.getData(al);
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(21);
		al.add(32);
		al.add(32);
		System.out.println(al);
		ArrayList<?extends Number> al2=al;
		//al2.add(123);
		al.add(123);
		System.out.println(al);
		
	}
	
	
	
}
