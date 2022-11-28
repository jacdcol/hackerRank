import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static void miniMaxSum(List<Integer> arr){
        int min = 0;
        int max = 0;
        long minSum = 0;
        long maxSum = 0;
        for(int i = 1; i < 5; i++){
            if (arr.get(i) < arr.get(min)) min = i;
            if (arr.get(i) > arr.get(max)) max = i;
        }
        for(int i = 0; i < 5; i++){
            if (i != max) minSum += (long)arr.get(i);
            if (i != min) maxSum += (long)arr.get(i);
        }    
        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}