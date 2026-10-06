public class twelve {
    public static void main(String[] args) {
    }
    class Solution {
        public int solution(int num) {
            int answer = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    answer += i;
                }
            }
            return answer;
        }
    }
}