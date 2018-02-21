package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraylength = sc.nextInt();
		int arrayUpdates = sc.nextInt();
		long[] arr = new long[arraylength];
		int a = 0,b = 0,c = 0;
		OptionalLong max ;
		for(int i=0; i<arrayUpdates; i++)
		{
			 a = sc.nextInt();
			 b =  sc.nextInt();
			 c =  sc.nextInt();
			for(int j=a-1; j<b; j++){
			     arr[j] += c;
			 }		
			 
			/* Arrays.fill(arr, a, b, c);*/
			 Arrays.stream(arr).forEach(System.out::println);
			 System.out.println("************");
			
		}
		 max = Arrays.stream(arr).max();
		 System.out.println(max.getAsLong());
		 
		/* int n = sc.nextInt();
		 int m = sc.nextInt();
		 long[] output = new long[n];
		 IntStream.range(0,m).forEach(i -> { int a = sc.nextInt()-1;
		                                    int b = sc.nextInt();
		                                    int k = sc.nextInt();
		                                    output[a] += k;
		                                    if(b < n) output[b] -= k; });
		 AtomicLong sum = new AtomicLong(0);
		 System.out.print(LongStream.of(output).map(sum::addAndGet)
		                                       .max().getAsLong()); */
		
        
	}

}
