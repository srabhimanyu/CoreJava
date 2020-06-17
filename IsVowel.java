import java.io.*;
public class IsVowel {

	
public static void main(String args[])throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str="AaEeIiOoUu";  // string containing vowels
	char ch=(char) br.read();
	

	if(str.indexOf(ch)!=-1) 
		System.out.println("The character is vowel"+ch);
		
	else
		System.out.println("The character is not vowel"+ch);
	
	
	
	
}
	
	
	
}
