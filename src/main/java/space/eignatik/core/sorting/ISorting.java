package space.eignatik.core.sorting;

public interface ISorting {
    int[] sort() throws Exception;

    default void printArray(int[] arrayToPrint) {
        for (int i : arrayToPrint) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
