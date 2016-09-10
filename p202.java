import java.io.*;

import java.util.Scanner;

public class p202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u')
			{
			sb.append(s.charAt(i));
		    continue;
			}
			else
			{
				sb1.append(s.charAt(i));
			    continue;
		
			}
				
		}
		System.out.println(sb.append(sb1));
			
		}

	}


