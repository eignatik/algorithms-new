package space.eignatik.core.sorting;

public class InsertionSorting extends Sorting {
    public InsertionSorting(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public int[] sort() throws Exception {
        if (arrayToSort == null) throw new Exception("There is no instance of " + InsertionSorting.class);
        int index, elemToInsert;
        for (int i = 1; i < arrayToSort.length; i++) {
            elemToInsert = arrayToSort[i];
            index = i;
            while (index > 0 && arrayToSort[index - 1] >= elemToInsert) {
                arrayToSort[index] = arrayToSort[index - 1];
                --index;
            }
            arrayToSort[index] = elemToInsert;
        }
        printArray(arrayToSort);
        return arrayToSort;
    }
}
