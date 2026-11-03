public class Main {
    public static void main(String[] args) {
        int[] numbers = {35, 69, -51, 10, 320, 63, 58, 26, 13, -3};

        System.out.println("Before bubble sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort:");
        printArrayElements(numbers);

        int[] numbers2 = {35, 69, -51, 10, 320, 63, 58, 26, 13, -3};

        System.out.println("\n\nBefore selection sort:");
        printArrayElements(numbers2);

        selectionSort(numbers2);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers2);
    }
    private static void printArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++) {
                if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            int temp = array[lastSortedIndex];
            array[lastSortedIndex] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }
}