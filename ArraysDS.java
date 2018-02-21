package StringAssessement;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] iarr = new int[length-1];
        String str = "";
        for(int i=0; i<length; i++){
            str = sc.nextInt() + " " +str ;
        }
        System.out.println(str);
	}

}
