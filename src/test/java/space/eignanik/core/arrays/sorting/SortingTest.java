package space.eignanik.core.arrays.sorting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import space.eignatik.core.arrays.sorting.MergeSorting;
import space.eignatik.core.arrays.sorting.InsertionSorting;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SortingTest {
    @DataProvider(name = "arraysToSort")
    public Object[][] getArraysToSort() {
        return new Object[][] {
                {new int[]{1, 5, 3, 9, 7, 4}, new int[]{1, 3, 4, 5, 7, 9}},
                {new int[]{1, 5, 3, 9, 7, 12, 11, 6, 8, 44, 1, 0}, new int[]{0, 1, 1, 3, 5, 6, 7, 8, 9, 11, 12, 44}}
        };
    }

    @Test(dataProvider = "arraysToSort")
    public void insertionSortingWorksCorrectly(int[] arrayToSort, int[] expectedArray) throws Exception {
        int[] result = new InsertionSorting(arrayToSort).sort();
        assertTrue(Arrays.equals(expectedArray, result));
    }

    @Test(dataProvider = "arraysToSort")
    public void mergeSortingWorksCorrectly(int[] arrayToSort, int[] expectedArray) throws Exception {
        int[] result = new MergeSorting(arrayToSort).sort();
        assertTrue(Arrays.equals(expectedArray, result));
    }
}
