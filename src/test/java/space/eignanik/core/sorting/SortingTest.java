package space.eignanik.core.sorting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import space.eignatik.core.sorting.Sorting;
import space.eignatik.core.sorting.InsertionSorting;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SortingTest {
    @DataProvider(name = "arraysToSort")
    public Object[][] getArraysToSort() {
        return new Object[][] {
                {new int[]{1, 5, 3, 9, 7}, new int[]{1, 3, 5, 7, 9}},
                {new int[]{1, 5, 3, 9, 7, 12, 6, 8, 44, 1, 0}, new int[]{0, 1, 1, 3, 5, 6, 7, 8, 9, 12, 44}}
        };
    }

    @Test(dataProvider = "arraysToSort")
    public void testIfInsertionSortingWorksCorrectly(int[] arrayToSort, int[] expectedArray) throws Exception {
        int[] result = new InsertionSorting(arrayToSort).sort();
        assertTrue(Arrays.equals(expectedArray, result));
    }
}
