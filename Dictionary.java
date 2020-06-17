import java.io.*;
import java.util.StringTokenizer;
public class Dictionary {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // for taking input from the user
		
		
		String str=br.readLine();
		
		str=str.substring(1,str.length()-1); // for removing the opening and closing parenthesis
		
		StringTokenizer ss=new StringTokenizer(str,",");
		
		int c=0;
		String strR="";
		while(ss.hasMoreTokens()) {
			
			String a=ss.nextToken(); // for extracting the word
			
			if(a.length()>=c) {
			   strR=a;
			   c=a.length();
			
			}
			
			
		}
		
		System.out.println(strR); // displaying the maximum length word
		
		
		
		
	}
	
	

}
