import java.io.*;

class producedTheOutpupt {
    
public static void main(String args[]) throws IOException{
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();
    
    producedTheOutpupt p = new producedTheOutpupt();
    
    p.print(str);
    
    }   

    void print(String str){
        
         char ch,a;
         String strR="";
         
         str = str + ' ';
        int k = 1;
        ch = str.charAt(0);
        for(int i=1;i<str.length();i++){
            
            
            if(str.charAt(i) >='A' && str.charAt(i) <='Z' || str.charAt(i) >='a' && str.charAt(i) <='z' || str.charAt(i)==32)
            {  
                strR = str.substring(k,i);   
                k  = i + 1;
               
               int count = new Integer(strR).intValue();
               
               display(ch,count);
                
                ch = str.charAt(i);
            }
                
         
        }
    }
        
        void display(char ch,int count){
            
            for(int i=1;i<=count;i++) 
             System.out.print(ch);
            
        }
        
    }
    
   
