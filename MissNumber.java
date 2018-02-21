package StringAssessement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * 
 * 
 * 10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
 */
public class MissNumber {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < max; i++) {
			list1.add(scan.nextInt());
		}
		int comp = scan.nextInt();
		for (int i = 0; i < comp; i++) {
			list2.add(scan.nextInt());
		}
		Collections.sort(list1);
		Collections.sort(list2);

		System.out.println(list1);
		System.out.println(list2);

		for (int i = 0; i < list1.size(); i++) {

			int a = Collections.binarySearch(list2, (int) list1.get(i));
			System.out.println(a + "value");

			if (a != -1) {
				list2.remove(a);
			}

		}
		for (int e : list2) {
			System.out.print(e + " ");
		}
	}

}
