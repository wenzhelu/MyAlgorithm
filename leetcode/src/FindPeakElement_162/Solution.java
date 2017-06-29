package FindPeakElement_162;

/**
 * A peak element is an element that is greater than its neighbors.
 *
 * Given an input array where num[i] ≠ num[i+1],
 * find a peak element and return its index.
 *
 * The array may contain multiple peaks,
 * in that case return the index to any one of the peaks is fine.
 *
 * You may imagine that num[-1] = num[n] = -∞.
 *
 * For example, in array [1, 2, 3, 1], 3 is a peak element and
 * your function should return the index number 2.
 *
 * Note:
 * Your solution should be in logarithmic complexity.
 */
public class Solution {
    public int findPeakElement(int[] a) {
        int lo = 0,hi = a.length-1;
        // notice lo and hi inclusive
        while(lo<hi){
            int mid = (lo+hi)>>1;
            if(a[mid]>a[mid+1]) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
}