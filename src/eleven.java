public class eleven {
import java.util .*;
    public static void main(String[] args) {
    }
    public class Solution {
        public int solution(int num) {
            int answer = 0;
            while (num > 0) {
                answer += num % 10;
                num /= 10;
            }
            return answer;
        }
    }
}