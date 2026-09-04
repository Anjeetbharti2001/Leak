// Reverse an array using two pointers

public class Stars {

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = {3, 5, 6, 7, 8, 9};

        reverse(arr);
    }
}