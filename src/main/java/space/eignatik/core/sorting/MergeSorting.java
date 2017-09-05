package space.eignatik.core.sorting;

public class MergeSorting extends Sorting {

    private int arrayLength;
    private int[] tempArray;

    public MergeSorting(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
        arrayLength = arrayToSort.length;
        tempArray = new int[arrayLength];
    }

    @Override
    public int[] sort() {
        mergeSort(0, arrayLength - 1);
        return tempArray;
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        while (higherIndex > lowerIndex) {
            int middleIndex = lowerIndex + (higherIndex - lowerIndex)/2;
            mergeSort(lowerIndex, middleIndex);
            mergeSort(middleIndex + 1, higherIndex);
            merge(lowerIndex, middleIndex, higherIndex);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i < middle; i++) {
            tempArray[i] = arrayToSort[i];
        }

        int i = low;
        int j = middle + 1;
        int index = low;
        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                arrayToSort[index] = tempArray[i];
                i++;
            } else {
                arrayToSort[index] = tempArray[j];
                j++;
            }
            index++;
        }

        while(i <= middle) {
            arrayToSort[index] = tempArray[i];
            index++;
            i++;
        }
    }
}
