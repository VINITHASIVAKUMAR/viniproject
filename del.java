import java.util.*; 
import java.lang.*; 
 class del
{ 
  public static void main(String args[]) 
   { 
    Scanner sc=new Scanner(System.in); 
    String s1=sc.next(); 
    int a=sc.nextInt(); 
    char ar[]=s1.toCharArray(); 
    Arrays.sort(arr); 
     StringBuffer sb=new StringBuffer(); 
     for(int i=0;i<ar.length-a;i++) 
     { 
       sb.append(ar[i]); 
     } 
     System.out.println(sb.toString()); 
      
   } 
 } 
