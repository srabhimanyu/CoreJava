import java.io.*;
public class CommonDigit {

	
public static void main(String args[])throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // for taking input from the user
	
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	
	int R[]=new int[10];
	
	int Num=a;  
	while(Num>0) {
		R[(Num%10)]=1;
		Num/=10;
		
	}
	
	int Num1=b;
	int flag=0; // supposing there is no common digit between the two
	while(Num1>0) {
		
		if(R[(Num1%10)]==1) {
			
			flag=1; // it is common
			break; // then come out of loop
		}
		
		Num1/=10;
	}
	
	 if(flag==1) 
		 System.out.println("True"); // print true if it is common element between the two number
	 
	 else System.out.println("false"); // print false if it is not common element between the two number
}  // closing of the main method
	
} // closing of the class
