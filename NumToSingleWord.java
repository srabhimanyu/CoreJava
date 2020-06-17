import java.io.*;
public class NumToSingleWord {

public static void main(String args[])throws IOException{
	
	
	String str[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	String strR="";

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int Num=Integer.parseInt(br.readLine());
	int sum=0;
	
	while(Num>0) {
		
		sum=sum+(Num%10);
		Num/=10;
	}
	
    	while(sum>0) {
		
	    strR= str[sum%10]+" "+strR;	
		
		sum/=10;
	}
	
	System.out.println(strR); // for printing the result
	
	
	
} // closing of the main method	
} // closing of the class
