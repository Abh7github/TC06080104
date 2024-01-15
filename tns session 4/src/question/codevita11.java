package question;

import java.util.Scanner;

public class codevita11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int swaps = bubbleSort(arr, n);
        System.out.println(swaps);
    }

    static int bubbleSort(int[] arr, int n) {
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swaps++;
                }
            }

            
            if (!swapped) {
                break;
            }
        }

        return swaps;
    }
}