package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SparseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++){
            list.add(sc.next());
        }
        
        //System.out.println(list);
        
          int q = sc.nextInt() ;        
        
        for(int i=0; i<q; i++)
        {
        	  /* int count = 0;
               String s = sc.next();
               for(String str : list) {
                   if(str.equals(s))
                       count++;
               }
               System.out.println(count);*/
        	System.out.println(Collections.frequency(list, sc.next()));
        }
        
        
        
        /*
         Scanner in = new Scanner(System.in);
        List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
        IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
         */
           
            
        }

	}


