import java.io.*;
public class UniqueString {
	
	
	public static void main(String args[])throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		
		int a[]=new int[26];
	
      //	System.out.println(a[1]);
		
		int ASCII=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i); // for extracting the character
			
			if(ch>='A'&&ch<='Z') 
			  ASCII=65;
			
			if(ch>='a'&& ch<='z')
				ASCII=97;
			
			a[ch-ASCII]++; // for considering the upper case or lower case letter		
			
		}
		
		int flag=1; // assuming it is a unique string
		
		for(int i=0;i<26;i++)
		{
			
			if(a[i]>1) {
				flag=0; // it is not a unique string then break the code
				break; // for coming out of loop
			}
			
		}
		  if(flag==1) 
			  System.out.println("The string is unique");
			  
		  else
			  System.out.println("The string is not unique");
		
		
	} // closing of the main method
	
} // closing of the class
