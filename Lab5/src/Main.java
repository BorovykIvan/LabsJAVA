public class Main {
    public static void bubbleSort(float[] arr) {
        int n = arr.length;
        float temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(float[] arr) {
        System.out.print("Array Elements: ");
        for (float element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void selectionSortDescending(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i; // find the index of the maximum value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // swap the found maximum value with the value at position 'i'
            float temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        float[] myFloatArray = {5.4f, 2.1f, 8.7f, 3.6f, 1.9f};
        //bubbleSort(myFloatArray);
        selectionSortDescending(myFloatArray);
        printArray(myFloatArray);
    }
}
