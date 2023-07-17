import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Enter the base : ");
        int base = scanner.nextInt();
        int output = findAnyBaseToDecimal(number, base);
        System.out.println("Output : " + output);
    }

    private static int findAnyBaseToDecimal(int number, int base) {
        int sum = 0, power = 0;
        while (number > 0){
            int temp = number % 10;
            number = number / 10;
            sum += temp * Math.pow(base , power);
            power++;
        }
        return sum;
    }
}
