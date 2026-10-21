public class Nineteen {
    class Solution {
        class Solution {
            public long solution(int a, int b) {
                long sum = 0;
                if (a <= b) {
                    for(int i = a; i <= b; i++) {
                        sum += i;
                    }
                } else {
                    for(int i = a; i >= b; i--) {
                        sum += i;
                    }
                }
                long answer = sum;
                return answer;
            }
        }
    }
}
