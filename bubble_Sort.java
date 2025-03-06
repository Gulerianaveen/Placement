public class bubble_Sort {
    public static void main(String args[]) {
        int arr[] = {4, 6, 2, 67, 77, 3};
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {  
            for (int j = 0; j < len - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
