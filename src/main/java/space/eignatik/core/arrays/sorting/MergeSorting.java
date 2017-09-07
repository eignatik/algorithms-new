package space.eignatik.core.arrays.sorting;

public class MergeSorting extends Sorting {

    private int arrayLength;
    private int[] merged;

    public MergeSorting(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
        arrayLength = arrayToSort.length;
        merged = new int[arrayLength];
    }

    @Override
    public int[] sort() {
        //TODO: fix incorrect sorting. Overwriting array elements and so on
        mergeSort(0, arrayLength - 1);
        printArray(merged);
        return merged;
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex == higherIndex) return;
        int midIndex = (lowerIndex + higherIndex)/2;
        mergeSort(lowerIndex, midIndex);
        mergeSort(midIndex + 1, higherIndex);
        merge(lowerIndex, midIndex + 1, higherIndex);
    }

    private void merge(int lowerBound, int middleBound, int higherBound) {

        int mergedIndex = 0;
        int lowerIndex = lowerBound;
        int middleIndex = middleBound - 1;
        int elemsCount = higherBound - lowerBound + 1;

        while(lowerBound <= middleIndex && middleBound <= higherBound) {
            if (arrayToSort[lowerBound] < arrayToSort[middleBound]) {
                merged[mergedIndex++] = arrayToSort[lowerBound++];
            } else {
                merged[mergedIndex++] = arrayToSort[middleBound++];
            }
        }

        while(lowerBound <= middleIndex) {
            merged[mergedIndex++] = arrayToSort[lowerBound++];
        }

        while(middleBound < higherBound) {
            merged[mergedIndex++] = arrayToSort[middleBound++];
        }

        for (int i = 0; i < elemsCount; i++) {
            arrayToSort[lowerIndex + i] = merged[i];
        }
    }
}
