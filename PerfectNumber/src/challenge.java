public class challenge {
    public static void main(String[] args) {
        System.out.println(factorOf(6));
    }

    public static String factorOf(int number) {
        int sum = 0;
        String answer = "";
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
            if (sum == number) {
                answer += "This is a perfect number";
            } else {
                answer += "This is not a perfect number";
            }
        
        return answer;
    }
}