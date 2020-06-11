import java.io.IOException;
import java.util.ArrayList;
import java.util.List;;

public class ArrayListExample {

public static void main(String args[])throws IOException{
	
List list=new ArrayList();

list.add("dog");
list.add(5);

System.out.println(list);

List pets =new ArrayList<>();

pets.add("dog");

System.out.println(pets);
pets.add(0,"cat");

System.out.println(pets);

pets.add(1,"paroot");
pets.add(0,"husky");

System.out.println(pets);

pets.remove(0);
System.out.println(pets);

pets.set(0,"ab");

System.out.println(pets);



}
	
	
	
	
}
