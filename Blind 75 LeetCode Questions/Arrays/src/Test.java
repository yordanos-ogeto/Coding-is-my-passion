import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testFindMinIndex() {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int expectedIndex = 0;
        int[] arr1 = {3, 4, 5, 1, 2};
        int expected1 = 1;
        int[] arr2 = {11, 13, 15, 17};
        int expected2 = 11;
        int actualIndex = RotatedSortedArrayMin.rotatedSortedArrayMint(rotatedArray);
        int actual1 = RotatedSortedArrayMin.rotatedSortedArrayMint(arr1);
        int actual2 = RotatedSortedArrayMin.rotatedSortedArrayMint(arr2);
        assertEquals(expectedIndex, actualIndex);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);

    }

    @org.junit.Test
    public void testIsPalendrome() {
        int num = 121;
        boolean expected = true;

        boolean actual = Palindrome.isPalendrom(num);
        assertEquals(expected, actual);
    }
}
