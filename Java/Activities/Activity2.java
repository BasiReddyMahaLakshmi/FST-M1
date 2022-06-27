package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {

        int[] num = {10, 77, 10, 54, -11, 10};
        System.out.println("Array: " + Arrays.toString(num));

        int searchNum = 10;
        int totalSum = 30;

        System.out.println("Result: " + result(num, searchNum, totalSum));
    }

    public static boolean result(int[] numbers, int searchNum, int totalSum) {
        int temp_sum = 0;
        for (int number : numbers) {
            if (number == searchNum) {
                temp_sum += searchNum;
            }
            if (temp_sum > totalSum) {
                break;
            }
        }
        return temp_sum == totalSum;
    }
}