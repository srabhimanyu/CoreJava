import java.io.*;
public class NumToWord {

public static void main(String args[])throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int Num=Integer.parseInt(br.readLine());
	
	if(Num>999) {
		
		System.out.println("Error! Please Enter maximum of three digit number");
		System.exit(1);
	}
	
	String str[]=new String[1000]; // String array of 1000 length
	
	str[0]=" ";
	str[1]="One";
	str[2]="Two";
	str[3]="Third";
	str[4]="Four";
	str[5]="Five";
	str[6]="Six";
	str[7]="Seven";
	str[8]="Eight";
	str[9]="Nine";
	str[10]="Ten";
	str[11]="Eleven";
	str[12]="Twelve";
	str[13]="Thirteen";
	str[14]="fourteen";
	str[15]="fifteen";
	str[16]="Sixteen";
	str[17]="Seventeen";
	str[18]="Eighteen";
	str[19]="Nineteen"; 
	str[20]="Twenty";
	str[30]="Thirty";
	str[40]="Fourty";
	str[50]="Fifty";
	str[60]="Sixty";
	str[70]="Seventy";
	str[80]="Eighty";
	str[90]="Ninety";
	str[100]="Hundred";
	
	
	for(int i=21;i<=99;i++)
		str[i]= str[i/10*10]+" "+str[i%10]; // for the number between 21 and 99
	
	for(int i=101;i<=999;i++) 
		str[i]=str[i/100]+"  Hundred  "+str[i%100];
	
	if(Num>0)
	System.out.println(str[Num]);
	
	else 
		System.out.println("Zero");
	
	
} // closing of the main method
		
} // closing of the class
