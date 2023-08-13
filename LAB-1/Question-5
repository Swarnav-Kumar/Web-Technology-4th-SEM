/* WAP to check whether the number is an Armstrong number or not.*/

import java.util.Scanner;

public class program1_5
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:-");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an armstrong number.");
        } else {
            System.out.println(num + " is not an armstrong number.");
        }
    }
}
