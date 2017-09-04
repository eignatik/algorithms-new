package space.eignanik.core.sorting;

import com.sun.tools.javac.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import space.eignatik.core.sorting.ISorting;
import space.eignatik.core.sorting.InsertionSorting;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.*;

public class InsertionSortingTest {
    private ISorting sorting;

    @DataProvider(name = "arraysToSort")
    public Object[][] getArraysToSort() {
        return new Object[][] {
                {new int[]{1, 5, 3, 9, 7}, new int[]{1, 3, 5, 7, 9}},
                {new int[]{1, 5, 3, 9, 7, 12, 6, 8, 44, 1, 0}, new int[]{0, 1, 1, 3, 5, 6, 7, 8, 9, 12, 44}}
        };
    }

    @Test(dataProvider = "arraysToSort")
    public void testIfSortWorksCorrectly(int[] arrayToSort, int[] expectedArray) throws Exception {
        sorting = new InsertionSorting(arrayToSort);
        int[] result = sorting.sort();
        assertTrue(Arrays.equals(expectedArray, result));
    }
}
