/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int c,n;
        String s;
        while (t--!=0) {
            n=sc.nextInt();
            s=sc.next();
            c=0;
            for (int i=0;i<n;i++) {
                char ch=s.charAt(i);
                if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                    System.out.println(ch);
                    c++;
                    if (c==4) {
                        System.out.println("No");
                        break;
                    }
                } else {
                    c=0;
                }
                System.out.println(ch+" "+c);
            }
            if (c<4) {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
