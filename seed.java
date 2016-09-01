import java.io.*;
import java.util.*;

public class seed {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=0;
    int d=a;
    int x=1; 
    while(a>0)
    {
        c=a%10;
        x=x*c;
    	a=a/10;
    }
    int y=x*d;
    if(b==y)
    {
    System.out.println(b+" is a seed of "+d);
    }
    else
    {
    System.out.println(b+" is not a seed of "+d);
    }
    }

}
