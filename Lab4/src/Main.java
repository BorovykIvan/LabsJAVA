public class Main {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        // Виводимо результат
        System.out.println("Кількість від'ємних елементів в масиві: " + countNegativeElements(array));
        System.out.println("Номер найбільшого за модулем елемента масиву: " + findIndexOfGreatestElement(array));
        System.out.println("Сформувати новий масив у наступний спосіб: " );
        printArray(transformArray(array));
    }
    private static int countNegativeElements(int[] arr) {
        int count = 0;

        for (int element : arr) {
            if (element < 0) {
                count++;
            }
        }

        return count;
    }
    private static int findIndexOfGreatestElement(int[] arr) {
        if (arr.length == 0) {
            // Handle empty array case
            return -1;
        }

        int greatestIndex = 0;
        int greatestAbsValue = Math.abs(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int currentAbsValue = Math.abs(arr[i]);

            if (currentAbsValue > greatestAbsValue) {
                greatestAbsValue = currentAbsValue;
                greatestIndex = i;
            }
        }

        return greatestIndex;
    }
    public static int[] transformArray(int[] arr) {
        int[] transformedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                transformedArray[i] = arr[i] * -1; // Multiply negative elements by -1
            } else if (arr[i] > 0) {
                transformedArray[i] = arr[i] - 3; // Reduce positive elements by 3
            } else {
                transformedArray[i] = -2; // Replace elements equal to 0 with -2
            }
        }

        return transformedArray;
    }
    public  static void printArray(int[] arr) {
        System.out.print("Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
