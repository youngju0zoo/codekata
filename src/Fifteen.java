public class Fifteen {
    public static void main(String[] args) {
    }
    class Solution {
        public int[] solution(long n) {
            long temp = n;
            int count = 0;

            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            int[] answer = new int[count];
            int i = 0;

            while (n > 0) {
                answer[i] = (int)(n % 10);
                n = n / 10;
                i++;
            }

            return answer;
        }
    }
}
