package StringAssessement;

import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
	/*input
	 * 
	 * 
	 * 
10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
	 */
	   Scanner scan = new Scanner(System.in);
       int aSize = scan.nextInt();
       int[] a = new int[aSize];
       for(int i = 0; i < aSize; i++) {
           a[i] = scan.nextInt();
       }
       
       int min = a[0];
       int bSize = scan.nextInt();
       int[] b = new int[bSize];
       for(int i = 0; i < bSize; i++) {
           b[i] = scan.nextInt();
           if(min > b[i])
               min = b[i];
       }
       
       int[] diff = new int[101];
       
       for(int cur : b) {
           diff[cur - min]++;
       }
       
       for(int cur : a) {
           diff[cur - min]--;
       }
       
       for(int i = 0; i < 101; i++) {
           if(diff[i] > 0)
               System.out.print((min + i) + " ");
       }
       
	}
}
