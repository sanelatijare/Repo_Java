import com.sun.tools.javac.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {


    public static void main(String[] args) {


        int[] array = {1, 3, 5, 4, 2, 7};
        int missingNumber = getMissingNumber(array, 7);
        System.out.println("Missing number in array is " + missingNumber);
    }


    public static int getMissingNumber(int[] array, int n) {
        int actualSum = 0;
        int expectedSum = (n * (n + 1) / 2);
        for (int i : array) {
            actualSum = actualSum + i;

        }
        return expectedSum - actualSum;

    }

}





   /* int[] arr = {3, 4, 5, 1, 6, 7, 8, 9, 10};
    int n = arr.length + 1;

    int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
        sum = sum - arr[i];
        }
        System.out.println("Missing number is " + sum);*/