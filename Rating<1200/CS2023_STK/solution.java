/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            int maxOm = -1, count = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    if (maxOm < count) {
                        maxOm = count;
                    }
                    count = 0;
                } else
                    count++;
            }
            if (maxOm < count)
                maxOm = count;

            int[] brr = new int[n];
            int maxAddy = -1;
            count = 0;
            for (int i = 0; i < brr.length; i++) {
                brr[i] = sc.nextInt();
                if (brr[i] == 0) {
                    if (maxAddy < count)
                        maxAddy = count;
                    count = 0;
                } else
                    count++;
            }
            if (maxAddy < count)
                maxAddy = count;

            if (maxAddy == maxOm)
                System.out.println("Draw");
            else
                System.out.println(maxAddy > maxOm ? "Addy" : "Om");
        }
        sc.close();
    }
}