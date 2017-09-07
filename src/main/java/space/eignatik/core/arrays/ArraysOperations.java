package space.eignatik.core.arrays;

public class ArraysOperations {
    private static int[] merge(int[] first, int[] second) {
        int mergedLength = first.length + second.length;
        int[] merged = new int[mergedLength];

        int firstIndexes = 0, secondIndexes = 0, mergedIndexes = 0;

        while(firstIndexes < first.length && secondIndexes < second.length) {
            if (first[firstIndexes] < second[secondIndexes]) {
                merged[mergedIndexes++] = first[firstIndexes++];
            } else {
                merged[mergedIndexes++] = second[secondIndexes++];
            }
        }

        while(firstIndexes < first.length) {
            merged[mergedIndexes++] = first[firstIndexes++];
        }

        while(secondIndexes < second.length) {
            merged[mergedIndexes++] = second[secondIndexes++];
        }

        return merged;
    }

    private static void displayArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
