
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 32, 42, 56, -4, 0, 15, -65, -12};
        int number;
        int min = arr[0];
        int max = arr[0];
        Arrays.sort(arr);

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = inp.nextInt();

        for (int i : arr) {
            if (i < number) {
                min = i;
            } else {
                max = i;
                break;
            }

        }
        System.out.println("Nearest and Min Number to " + number + " : " + min);
        System.out.println("Nearest and Min Number to " + number + " : " + max);


    }
}