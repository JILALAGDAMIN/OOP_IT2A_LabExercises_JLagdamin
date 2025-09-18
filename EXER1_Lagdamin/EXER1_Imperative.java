public class  EXER1_Imperative {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        if (sum > 10) {
            System.out.println("The sum is greater than 10: " + sum);
        } else {
            System.out.println("The sum is 10 or less: " + sum);
        }
    }
}
