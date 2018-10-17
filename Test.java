import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by danie on 22/10/2016.
 */
public class Test {
    public static void main(String[] args) {
       int[] l1 = new int[52];

        for (int i = 0; i < l1.length; i++) {
            l1[i] = i + 1;
        }

        Arrays.stream(l1).forEach(System.out::println);
		//hello
		
    }
}
