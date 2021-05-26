package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author chenjie
 * @date 2021/5/25-17:11
 */
public class Demo {
    public static void test() throws IOException {
        try(BufferedReader br = new BufferedReader(
                new FileReader("abc.txt")
        );
        ){
            String s;
            Set<Product> productSet  = new HashSet<>();
           while((s = br.readLine()) != null) {
               System.out.println(s);
//               转义
               String[] arr = s.split("\\|");
               System.out.println(Arrays.toString(arr));
               Product p = new Product(arr[0].trim(),arr[1].trim(),new Double(arr[2].trim()),Integer.valueOf(arr[3].trim()),arr[4].trim(),arr[5].trim());
               productSet.add(p);
           }
            System.out.println(productSet);
        }
    }
    public static void main(String[] args) throws IOException {
test();
    }
}
