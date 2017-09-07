package space.eignatik.core.arrays.sorting;

public abstract class Sorting {
    protected int[] arrayToSort;

    public abstract int[] sort() throws Exception;

    protected void printArray(int[] arrayToPrint) {
        for (int i : arrayToPrint) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public int[] getArrayToSort() {
        return arrayToSort;
    }

    public void setArrayToSort(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
    }
}
