package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int clap = 0;

        for(int i = 1; i <= number; i++){
            int temp = i;
            while(temp > 0) {
                if (temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) clap++;
                temp /= 10;
            }
        }
        return clap;
    }
}
