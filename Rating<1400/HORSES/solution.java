/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		int min=0,temp=0;
		
		while(t-- != 0) {
            int n=sc.nextInt();
            int s[] = new int[n];
            for (int i=0;i<n;i++) {
                s[i]=sc.nextInt();
            }
            min=Arrays.stream(s).max().getAsInt();
		    for (int i=0;i<n;i++) {
		        for (int j=0;j<n;j++) {
                    if (i==j) {
                        continue;
                    }
		            temp=s[i]-s[j];
                    System.out.println(min+" "+temp);
                    if (s[i]==s[j]) {
                        min=temp;
                    }
		            if (temp<min && temp>0) {
		                min=temp;
		            }
		        }
		    }
            System.out.println("*"+min);
		}
        sc.close();
	}
}
