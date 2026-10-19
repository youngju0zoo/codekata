import java.util.Arrays;

public class Seventeen {
    class Solution {
        public long solution(long n) {
            double x = Math.sqrt(n);
            // n이 양의정수 x의 제곱이라면
            if( x % 1 == 0 ) {
                return (long) Math.pow(x + 1, 2);
            } else {
                return -1;
            }
        }
    }
    class Solution {
        public long solution(long n) {
            String str = String.valueOf(n);
            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String result = "";

            for (int i = arr.length - 1; i >= 0; i--) {
                result += arr[i];
            }

            return Long.parseLong(result);
        }
    }
}
