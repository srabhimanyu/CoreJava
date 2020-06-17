import java.io.*;
public class AppendLastThree {

public static void main(String args[])throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String str=br.readLine();
	
	if(str.length()<3) {
		System.out.println("Eror! Minimum length of string required is three, please enter string of given length three or above ");
		System.exit(1);;
	}
	
	String str1 = str.substring(str.length()-3); // for extracting the substring
	
      str = str1 + str + str1; // for appending the last three in front and after
	
	System.out.println(str); // printing the resultant string
	
	
} // closing of the main 	
} // closing of the class
