package one;

public class Twenty {
    class Solution {
        public int solution(int num) {
            int x = 0;
            long number = num;
            while(number != 1) {
                if(number % 2 == 0) {
                    number = number / 2;
                } else if(number % 2 != 0) {
                    number = number * 3 + 1;
                }
                x++;
                if(x == 500 && number != 1) {
                    return -1;
                }
            }
            int answer = x;
            return answer;
        }
    }
}
