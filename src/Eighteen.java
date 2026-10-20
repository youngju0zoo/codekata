public class Eighteen {

    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int sum = 0;
            int original = x;
            while(x > 0) {
                sum += x % 10;
                x = x / 10;
            }
            answer = original % sum == 0;
            return answer;
        }
    }

}
